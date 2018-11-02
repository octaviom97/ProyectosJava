import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Secuenciador {
    
    JPanel mainPanel;
    ArrayList<JCheckBox> botonesCheck;
    Sequencer secuenciador;
    Sequence secuencia;
    Track track;
    JFrame miFrame;
    
    String[] sonidos = { "Sonido 1", 
                          "Sonido 2",
                          "Sonido 3",
                          "Sonido 4",
                          "Sonido 5",
                          "Sonido 6",
                          "Sonido 7",
                          "Sonido 8"};
                                  

    
int[] instrumentos = { 35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63};

    public static void main(String[] args) {
        new Secuenciador().interfaz();
    }
    
    public void interfaz() {
        miFrame = new JFrame("Secuenciador Mamalon");
        miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout layout = new BorderLayout();
        JPanel background = new JPanel(layout);
        background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        botonesCheck = new ArrayList<>();
        Box buttonBox = new Box(BoxLayout.Y_AXIS);
        
        JButton start = new JButton("Iniciar");
        start.addActionListener(new Iniciar());
        buttonBox.add(start);
        
        JButton stop = new JButton("Detener");
        stop.addActionListener(new Detener());
        buttonBox.add(stop);
        
        JButton clear = new JButton("Limpiar");
        clear.addActionListener(new Limpiar());
        buttonBox.add(clear);
        
        JButton random = new JButton("Random");
        random.addActionListener(new Random());
        buttonBox.add(random);

        JButton masVeloz = new JButton("Más rápido");
        masVeloz.addActionListener(new MasRapido());
        buttonBox.add(masVeloz);
        
        JButton menosVeloz = new JButton("Más lento");
        menosVeloz.addActionListener(new MasLento());
        buttonBox.add(menosVeloz);
        
        Box botonSonido = new Box(BoxLayout.Y_AXIS);
        for(int i = 0; i < 8; i++) {
            botonSonido.add(new Label(sonidos[i]));
        }
        
        background.add(BorderLayout.WEST, buttonBox);
        background.add(BorderLayout.EAST, botonSonido);
        
        miFrame.add(background);
        
        GridLayout grid = new GridLayout(8, 8);
        grid.setVgap(1);
        grid.setHgap(2);
        mainPanel = new JPanel(grid);
        background.add(BorderLayout.CENTER, mainPanel);
        
        for(int i = 0; i < 256; i++) {
            JCheckBox c = new JCheckBox();
            c.setSelected(false);
            botonesCheck.add(c);
            mainPanel.add(c);
        }
        
        setUpMidi();
        
        miFrame.pack(); 
        miFrame.setLocationRelativeTo(null);
        miFrame.setVisible(true);
    }

    public void setUpMidi() {
        try {
            secuenciador = MidiSystem.getSequencer();
            secuenciador.open();
            secuencia = new Sequence(Sequence.PPQ, 4);
            track = secuencia.createTrack();
            secuenciador.setTempoInBPM(120);
        } catch (Exception e) { e.printStackTrace(); }
    }

    public void iniciarTrack() {
        int[] trackList = new int[16];
        
        secuencia.deleteTrack(track);
        track = secuencia.createTrack();
        
        for (int i = 0; i < 16; i++) {
            int key = instrumentos[i];
            
            for (int j = 0; j < 16; j++) {
                JCheckBox jc = (JCheckBox)botonesCheck.get(j + 16 * i);
                if(jc.isSelected()) {
                    trackList[j] = key;
                } else {
                    trackList[j] = 0;
                }
            }
            
            makeTracks(trackList);
            track.add(hacerEvento(176,1,127,0,16));
        }
        
        track.add(hacerEvento(192,9,1,0,15));
        try {
            secuenciador.setSequence(secuencia);
            secuenciador.setLoopCount(secuenciador.LOOP_CONTINUOUSLY);
            secuenciador.start();
            secuenciador.setTempoInBPM(120);
        } catch(Exception e) { e.printStackTrace(); }
    }
    
    class Iniciar implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            iniciarTrack();
        }
    }

    class Detener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            secuenciador.stop();
        }
    }
    
    
    class Limpiar implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for(JCheckBox c : botonesCheck) {
                c.setSelected(false);
            }
        }
    }
    
    class Random implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for(JCheckBox c : botonesCheck) {
                boolean bool = Math.random() < 0.1;
                c.setSelected(bool);
            }
        }
    }

    class MasRapido implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            float tiempo = secuenciador.getTempoFactor();
            secuenciador.setTempoFactor((float)(tiempo * 1.15));
        }
    }
    
    class MasLento implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            float tiempo = secuenciador.getTempoFactor();
            secuenciador.setTempoFactor((float)(tiempo * 0.85));
        }
    }
    
    
    public void makeTracks(int[] list) {
        for (int i = 0; i < 16; i++) {
            int key = list[i];
            
            if(key != 0) {
                track.add(hacerEvento(144,9,key,100,i));
                track.add(hacerEvento(128,9,key,100,i+1));
            }
        }
    }
    
    public MidiEvent hacerEvento(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception e ) { e.printStackTrace(); }
        
        return event;
    }
}

