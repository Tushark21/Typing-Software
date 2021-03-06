/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typing.tutor;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.currentTimeMillis;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static typing.tutor.TypingTutor.p;

/**
 *
 * @author Tushar
 */
public class PracticeForm extends javax.swing.JFrame {

    /**
     * Creates new form PracticeForm
     */
    int height, width;
    WindowListener exitListener = new WindowAdapter() {

        @Override
        public void windowClosing(WindowEvent e) {
            exit();
        }
    };

    MyCanvas myCanvas;
    Color bgColor = new Color(255, 255, 255);

    public PracticeForm() {
        
        String path = "C:\\Users\\Tushar\\Neatbeans Projects\\Typing Tutor\\src\\typing\\tutor\\background.jpg";

        Image img = Toolkit.getDefaultToolkit().getImage(path).getScaledInstance(628, 690, Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(img);
        this.setContentPane(new JLabel(image));

        initComponents();
        this.setTitle("Practice");
        
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Tushar\\Neatbeans Projects\\Typing Tutor\\src\\typing\\tutor\\icon.png"));
        
        addParas();
        Dimension size = this.getSize();
        height = size.height;
        width = size.width;

        //paraLabel.setBackground(new Color(0,0,0,50));
        //paraText.setBackground(new Color(255,255,255,50));
        //this.getContentPane().setBackground(bgColor);
        this.addWindowListener(exitListener);

        System.out.println("constructor");
        addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                //System.out.println(e.getKeyCode());

                if ((e.getKeyCode() >= 65 && e.getKeyCode() <= 90) || (e.getKeyCode() >= 44 && e.getKeyCode() <= 57) || (e.getKeyCode() >= 91 && e.getKeyCode() <= 93)
                        || (e.getKeyCode() >= 105 && e.getKeyCode() <= 107) || (e.getKeyCode() >= 109 && e.getKeyCode() <= 111)
                        || e.getKeyCode() == 59 || e.getKeyCode() == 61 || e.getKeyCode() == 96 || e.getKeyCode() == 192
                        || e.getKeyCode() == 222 || e.getKeyCode() == 32) {
                    try {
                        keyPressedAction(e);
                    } catch (IOException ex) {
                        Logger.getLogger(PracticeForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        timeLabel = new javax.swing.JLabel();
        paraText = new javax.swing.JLabel();
        paraLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        canvas = new java.awt.Canvas();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        timeLabel1 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        timeLabel.setBackground(new java.awt.Color(255, 255, 255));
        timeLabel.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel.setText("00:00");
        timeLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));

        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(100, 20));
        setMaximumSize(new java.awt.Dimension(628, 690));
        setMinimumSize(new java.awt.Dimension(628, 690));
        setPreferredSize(new java.awt.Dimension(628, 690));
        setResizable(false);
        setSize(new java.awt.Dimension(628, 690));

        paraText.setBackground(new java.awt.Color(255, 255, 255));
        paraText.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        paraText.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        paraText.setAutoscrolls(true);
        paraText.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Writing Area", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 255, 255))); // NOI18N
        paraText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        paraText.setMaximumSize(new java.awt.Dimension(70, 23));
        paraText.setMinimumSize(new java.awt.Dimension(70, 23));
        paraText.setPreferredSize(new java.awt.Dimension(70, 23));

        paraLabel.setBackground(new java.awt.Color(255, 255, 255));
        paraLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        paraLabel.setForeground(new java.awt.Color(255, 255, 255));
        paraLabel.setText("Paragraph");
        paraLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        paraLabel.setAutoscrolls(true);
        paraLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        titleLabel.setBackground(new java.awt.Color(255, 255, 255));
        titleLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Title");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TYPING GURU");

        timeLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        timeLabel1.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel1.setText("00:00");
        timeLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(canvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(paraText, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(paraLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(timeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paraLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(canvas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paraText, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(timeLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String paraTitles[] = new String[25];
    String paragraphs[] = new String[25];
    String para = "";
    Random rand = new Random();
    //char characters[]={',','.','?','!',':',';'};
    int currChar = 0;
    String enteredPara = "";
    boolean timeSet = false;
    long startTime = 0, endTime = 0, newTime;
    int correctWords, wordCharCount = 0, counter = 0;
    boolean clockTimer = true;
    int correctChar = 0;
    float speed;

    void keyPressedAction(KeyEvent evt) throws IOException {

        //System.out.println(evt.getKeyChar()+","+evt.getKeyCode());
        char enteredChar = evt.getKeyChar();
        if (para.charAt(currChar) == ' ' || para.charAt(currChar) == ',' || para.charAt(currChar) == '.' || para.charAt(currChar) == '-') {
            if (wordCharCount == counter) {
                correctWords++;
            }
            wordCharCount = 0;
            counter = 0;
        }

        if (enteredChar == para.charAt(currChar)) {
            enteredPara += "<span bgColor=\"#99ffbb\">" + enteredChar + "</span>";
            paraText.setText("<html>" + enteredPara + "</html>");
            wordCharCount++;
            correctChar++;
        } else {
            enteredPara += "<span bgColor=\"#ffcccc\">" + enteredChar + "</span>";
            paraText.setText("<html>" + enteredPara + "</html>");
        }

        counter++;
        currChar++;

        //System.out.println(enteredPara);
        if (!timeSet) {
            timeSet = true;
            //prevTime=currentTimeMillis();
            startTime = currentTimeMillis();
            new Thread() {
                @Override
                public void run() {
                    while (clockTimer) {
                        displayTime();
                        /*
                        if((currentTimeMillis()-prevTime)>=100){
                            ticks++;
                            prevTime=currentTimeMillis();
                            myCanvas.repaint();
                        }
                         */
                    }
                }
            }.start();
        }

        if (para.length() <= currChar) {
            endTime = currentTimeMillis();
            clockTimer = false;
            storeInfo();
            JOptionPane.showMessageDialog(this, "Finished");
            this.dispose();
            //new MainFrame().setVisible(true);
            new ReportFrame(para.length(), correctChar, speed).setVisible(true);
        } else {
            if(para.charAt(currChar)>='A' && para.charAt(currChar)<='Z'){
                paraLabel.setText("<html><span  style=\"color:black\">" + para.substring(0, currChar) + "</span><span bgColor=\"#ffff33\" style=\"color:blue; font-weight:bold; font-size:28;\">" + para.charAt(currChar) + "</span>" + para.substring(currChar + 1) + "</html>");
            }
            else{
                paraLabel.setText("<html><span  style=\"color:black\">" + para.substring(0, currChar) + "</span><span bgColor=\"#ffff33\" style=\"color:blue; font-size:24;\">" + para.charAt(currChar) + "</span>" + para.substring(currChar + 1) + "</html>");
            }
        }
        /*
        totalCharEntered++;
        
        points[totalCharEntered-1]=(int)Math.ceil((double)((double)totalCharEntered/(double)TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis()-startTime))*10);
        points[totalCharEntered-1]%=25+1;
         */
    }

    void generatePara() {
        int num = rand.nextInt(21);
        titleLabel.setText(paraTitles[num]);
        para = paragraphs[num];

        /*
        for(int i=0;i<600;i++){
            int num1=rand.nextInt(26);
            int num2=rand.nextInt(26);
            if(num1!=num2){
                para+=(char)('a'+num1);
                if(num1%4==0){
                    para+=" ";
                }
            }
            else{
                int num=rand.nextInt(6);
                para+=characters[num];
            }
        }
         */
    }

    public void printPara() {
        currChar = 0;
        generatePara();
        if(para.charAt(currChar)>='A' && para.charAt(currChar)<='Z'){
            paraLabel.setText("<html><span bgColor=\"#ffff33\" style=\"color:blue; font-weight:bold; font-size:28;\">" + para.charAt(currChar) + "</span>" + para.substring(currChar + 1) + "</html>");
        }
        else{
            paraLabel.setText("<html><span bgColor=\"#ffff33\" style=\"color:blue; font-size:24;\">" + para.charAt(currChar) + "</span>" + para.substring(currChar + 1) + "</html>");
        }
    }
    public void exit() {
        new MainFrame().setVisible(true);
        this.dispose();
    }

    void displayTime() {
        /*
        try { 
            progressBar.setValue(counter + 10); 
            timeLabel.setText(""+TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis()-startTime));
                
            // delay the thread 
            Thread.sleep(1000);
            counter+=20;
        } 
        catch (Exception e) {
        } 
         */

        timeLabel1.setText(formatTime(currentTimeMillis() - startTime));
    }

    String formatTime(long millis) {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(millis) % 60;
        long minutes = TimeUnit.MILLISECONDS.toMinutes(millis) % 60;
        long hours = TimeUnit.MILLISECONDS.toHours(millis) % 60;

        String time = "";

        if (hours > 0) {
            if (hours < 10) {
                time += "0" + hours + ":";
            } else {
                time += "" + hours + ":";
            }
        }

        if (minutes < 10) {
            time += "0" + minutes;
        } else {
            time += "" + minutes;
        }
        if (seconds < 10) {
            time += ":0" + seconds;
        } else {
            time += ":" + seconds;
        }

        return time;
    }

    void storeInfo() throws IOException {

        FileReader reader = null;
        try {
            reader = new FileReader("info.properties");
        } catch (FileNotFoundException ex) {
            try {
                FileWriter fileWriter = new FileWriter("info.properties");
                reader = new FileReader("info.properties");
                //Logger.getLogger(TypingTutor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex1) {
                Logger.getLogger(TypingTutor.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        try {
            p.load(reader);
        } catch (IOException ex) {
            Logger.getLogger(ContainerFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        /*
        System.out.println("words:"+p.getProperty("wordsN"));
        System.out.println("time:"+p.getProperty("time"));
        System.out.println("testNum:"+p.getProperty("testNum"));
        System.out.println("lastSpeed:"+p.getProperty("lastSpeed"));
         */
        long wordsN = 0, time = 0;
        if (p.getProperty("wordsN") != null) {
            wordsN = Long.parseLong(p.getProperty("wordsN"));
        }
        if (p.getProperty("time") != null) {
            time = Long.parseLong(p.getProperty("time"));
        }

        wordsN += correctWords;
        newTime = endTime - startTime;
        time += newTime;

        float lastSpeed = (float) 0.0;
        float timeTaken = (float) 0.0;

        String tempTime = formatTime(newTime);
        //System.out.println(tempTime);
        if (tempTime.length() > 5) {
            timeTaken = (float) Integer.parseInt(tempTime.substring(0, 2)) * 60;
            timeTaken += (float) Integer.parseInt(tempTime.substring(3, 5));
            timeTaken += (float) Integer.parseInt(tempTime.substring(6, 8)) / 60;
        } else {

            timeTaken += (float) Integer.parseInt(tempTime.substring(0, 2));
            timeTaken += (float) Integer.parseInt(tempTime.substring(3, 5)) / 60;
        }
        lastSpeed = ((int) ((float) correctWords / timeTaken) * 100) / 100;
        speed = lastSpeed;

        int noOfTests = 0;
        if (p.getProperty("wordsN") != null) {
            noOfTests = Integer.parseInt(p.getProperty("testNum"));
        }
        noOfTests++;

        p.setProperty("wordsN", String.valueOf(wordsN));
        p.setProperty("time", String.valueOf(time));
        p.setProperty("testNum", String.valueOf(noOfTests));
        p.setProperty("lastSpeed", String.valueOf(lastSpeed));

        p.store(new FileWriter("info.properties"), "User Progress");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PracticeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PracticeForm().setVisible(true);
        });
    }

    //Canvas------------
    class MyCanvas extends Canvas {

        int h = 50, w = 480;
        int prevX = 0, prevY = 0, y = 0, x = 0;

        public MyCanvas() {
            setBackground(Color.white);

            setBounds(122, height - 90, w, h);
            //setBounds(0,0,800,800);
            this.enable(false);
        }

        @Override
        public void paint(Graphics g) {

            /*
            for(int i=0;i<totalCharEntered;i++){
                y=points[i];
                x=i;
                //y=(totalCharEntered*10/x)%25;
                g.setColor(Color.green);
                if(prevY>y){
                    g.drawLine(prevX, prevY+25, x, 25+y);
                }
                else{
                    g.drawLine(prevX, prevY+25, x, 25-y);
                    points[i]=-points[i];
                }
                
                prevX=x;
                prevY=y;
            }
            g.setColor(Color.red);
            //g.drawOval(10,10,20,20);
            //g.drawOval(totalCharEntered+offsetX, totalCharEntered+offsetY, 20, 20);
            
            System.out.print('*');
             */
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel paraLabel;
    private javax.swing.JLabel paraText;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel timeLabel1;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    void addParas() {
        paraTitles[0] = "A Wise Old Owl";
        paragraphs[0] = "There was an old owl that lived in an oak. Everyday he saw incidents happening around him. Yesterday he saw a boy helping an old man to carry a heavy basket. Today he saw a girl shouting at her mother. The more he saw the less he spoke. "
                + "As he spoke less, he heard more. He heard people talking and telling stories. He heard a woman saying that an elephant jumped over a fence. He also heard a man saying that he had never made a mistake. "
                + "The old owl had seen and heard about what happened to people. Some became better and some became worse. But the old owl had become wiser each and every day.";

        paraTitles[1] = "Beg Your Pardon Mrs Hardin";
        paragraphs[1] = "One afternoon, a little boy had lost his kitten. He looked under his bed. He looked all over his house. But still there was no puppy. Finally, he looked for his puppy in the garden. After a few hours, he still could not find the puppy. "
                + "The little boy was tired and was about to give up. Then he saw his neighbour, Mrs Hardin. "
                + "\"I beg your pardon, Mrs Hardin. Is my puppy in your garden?\" asked the little boy. "
                + "\"Oh yes, she is. She is chewing on a mutton bone,\" replied Mrs Hardin. "
                + "The little boy climbed the fence and saw his puppy chewing on a mutton bone. He was so happy that his puppy was not lost but had only gone to his good neighbor's house to eat.";

        paraTitles[2] = "Betty Botter";
        paragraphs[2] = "One day, Betty Botter wanted to bake a cake. She bought some cheap butter to bake it. But something was wrong with the butter. "
                + "\"This butter is bitter,\" said Betty Botter as she tasted the butter. "
                + "\"If I put it in my cake batter, it will make the batter bitter. But if I put a bit of better butter that would make my batter better.\" "
                + "So, she went off to buy a better butter than her bitter butter. She mixed a bit of better butter into her cake batter. She tasted the batter and was happy that the batter was not bitter. "
                + "She adopted the best way to solve the problem. Because there will be always one.";

        paraTitles[3] = "Bye Baby Bunting";
        paragraphs[3] = "One fine morning, a hunter was getting ready to go hunting. Before departing, he went to see his little baby. His baby was awake in a baby crib. He looked at his baby's blanket and thought the blanket might not be thick enough for the coming winter. "
                + "\"Bye, my little baby. Daddy is going hunting. Daddy is going to fetch some rabbit skin to make you a new blanket,\" said the hunter to his baby. "
                + "He kissed his baby and went off hunting. After the hunting, he bought a blanket which saved his child from the sever winter that followed.";

        paraTitles[4] = "Cobbler Cobbler";
        paragraphs[4] = "In a small town in England, there lived a poor little girl. Her friend invited her to come to her birthday party. She was so excited. But her right shoe was spoilt. She needed to get it mended quickly. So, she went to see a cobbler in her little town. "
                + "\"Cobbler, cobbler,\" called the girl. \"Please mend my shoe.\" "
                + "\"When do you want it done, little girl?\" asked the cobbler. "
                + "\"Get it done by half-past two. Then I will give you half a crown,\" said the girl. The cobbler smiled and quickly mended her shoe. "
                + "The cobbler finished repairing her shoe before half-past two. The little girl was so happy. Now, she could go to her friend's birthday party.";

        paraTitles[5] = "Cock-a-doodle doo";
        paragraphs[5] = "In a faraway land, there was a rooster who lived with his master and the wife. Every early morning, the rooster would make a very loud cook-a-doodle-doo sound. This shocked his master and the wife so much that they jumped up from their sleep. One day, the rooster heard that his master and the wife wanted to slaughter him for dinner. He was afraid. He wanted to run away. But before he went off, he quickly took one of the wife's shoes and the master's fiddling stick. Then he ran off into the forest feeling happy and satisfied.";

        paraTitles[6] = "Come To the Window";
        paragraphs[6] = "One night, there was a little baby who was still not asleep. His mother already tried rocking the baby to sleep but he was still wide awake. So, his mother took him to the window to see the stars. The stars shone on the sea. The mother told the baby some stories about the stars. She said that there were two little stars that played peek-a-boo with two little fishes in the deep blue sea. And there were two little frogs that cried 'Neap, neap, neap. We also see a dear little baby who should be asleep!'. The baby was happy and delighted. Soon, the little baby grew sleepy and fell asleep in his mother's arms.";

        paraTitles[7] = "Georgie Porgie";
        paragraphs[7] = "Georgie Porgie was a cheeky little boy. He liked to tease people especially little girls. One afternoon, he went to the park near his house. He found a little girl and tried to kiss her. The girl cried and sobbed because she did not like Georgie. Then, some boys came to the park and saw Georgie chasing after the girl. They shouted and laughed loudly at Georgie. Georgie stopped chasing the girl and ran away feeling embarrassed. Thereafter Georgie hesitated to play with his friends because he remembered his embarrassment that he faced in front of his friends. This incident prohibited him from chasing girls thereafter.";

        paraTitles[8] = "Grey Goose and Gander";
        paragraphs[8] = "Once upon a time, there was a peaceful kingdom. The king heard rumors that barbarians were going to attack his castle soon. So he called his two favorite pets - the huge grey goose and gander. \"My dear goose and gander, our kingdom is in danger. Take my daughter to a safe place on top of the tallest hill,\" said the king. So the grey goose and gander flew the princess who sat in a red sheet over the one-strand river to the top of the tallest hill. Six months had passed but the kingdom was not attacked. The king regretted his decision and told the grey goose and gander to bring home his daughter. Then the king understood that he had to be careful before taking actions based up the rumors which need not be true. The king was aware of his discretion before taking any decision.";

        paraTitles[9] = "Haste makes Waste";
        paragraphs[9] = "A woman had a pet mongoose. It was very faithful. One day she went to the market, leaving her baby in the care of the mongoose. At that time a big cobra entered the house. The mongoose killed it after a long and fierce fight. When the woman came back she saw the mongoose lying at the entrance. She noticed its blood-covered mouth. In her haste the woman thought that the mongoose had killed her baby. In a moment of sudden fury, the woman threw the water pot on the mongoose and killed it. Alas! When she entered the house she was filled with remorse. Her baby was playing cheerfully. Nearby a big cobra lay dead. The woman shed tears of grief fondling the carcass of the mongoose.";

        paraTitles[10] = "Honesty is The Best Policy";
        paragraphs[10] = "A milkman became very wealthy through dishonest means. He had to cross a river daily to reach the city where his customers lived. He mixed the water of the river generously with the milk that he sold for a good profit. One day he went around collecting the dues in order to celebrate the wedding of his son. With the large amount thus collected he purchased plenty of rich clothes and glittering gold ornaments. But while crossing the river the boat capsized and all his costly purchases were swallowed by the river. The milk vendor was speechless with grief. At that time he heard a voice that came from the river, Do not weep. What you have lost is only the illicit gains you earned through cheating your customers.";

        paraTitles[11] = "Hunting With The Lion";
        paragraphs[11] = "It was a dry summer. The animals in the forest were beginning to find it difficult to get food. A bear, a wolf and a jackal thought it would be better to join hands with a lion and do the hunting. They approached lion and he too agreed. The four of them went off hunting. The hunting party came across a buffalo. The fox and wolf chased the buffalo. The bear intercepted the buffalo. The lion killed him. The fox made shares out of the buffalo. When they were about to take their shares the lion roared and said, \"Well friends, the first share is mine for my leadership. The second share is mine for, it is I who killed. The third share is also mine for I need it for my cubs. Anyone who needs a share can take the fourth. But before that you will have to win me.\" All the three left the place without a single word.";

        paraTitles[12] = "Silly Little Mariam";
        paragraphs[12] = "There lived a little girl Mariam who was very silly and lazy. Often she used to wander hither and thither with no purpose. Once, as she went wandering she felt very thirsty. She went to a pond nearby and quenched her thirst. She felt very tired and drowsy. She slept right there on the banks of the pond. When she woke up it was night already. She peeped into the pond but could not see her reflection. She got a big doubt, \"Am I really here or not? Well! Let me ask at my home\". She went home and found the door closed. She called out \"Is Mariam in there?\" A sleepy voice replied, \"Oh! She must be in bed\". Mariam thought, \"If Mariam is at home, I am not Mariam\". Saying this, she went away.";

        paraTitles[13] = "The Crooked Tree";
        paragraphs[13] = "It was a dense forest. All trees were straight and tall. Their trunks were broad and shapely. But, there was one tree which was having a crooked and shapeless trunk. The crooked trunk tree was sad. He thought \"How ugly I am! All others are straight and shapely. I alone have crooked trunk. \"One day a wood-cutter came there. He looked around and said \"I will cut all trees here, except that crooked tree. That is of no use to me\". He cut away all other trees. Now, the crooked tree was happy for its crookedness.";

        paraTitles[14] = "Pussy is in the Well";
        paragraphs[14] = "Once upon a time, there was a very useful little pussy cat. The pussy cat killed all the mice in the farmer's barn. One day, a little boy called Johnny Green wanted to play with the pussy cat. Johnny played rough. He even tried to drown the pussy cat in a well. The pussy cat was terrified. It cried for help. A little boy called Tommy Stout was walking near the well. He heard the pussy cat's cry from inside the well. He went to the well and quickly pulled the pussy cat out. The pussy cat was very happy.";

        paraTitles[15] = "Do You Know the Muffin Man?";
        paragraphs[15] = "One afternoon, Mrs. Darby was having tea with her friend, Mrs Smith. On the table, there were two cups of tea and some muffins.\"Mmm, this muffin is delicious. Did you bake them yourself?\" asked Mrs Smith. \"No. Actually I bought them from the muffin man,\" replied Mrs Darby. \"The muffin man?\" asked Mrs Smith. \"Yes, the muffin man who lives in Drury Lane,\" said Mrs Darby. \"Oh yes, I know that muffin man,\" said Mrs Smith knowingly.";

        paraTitles[16] = "The Camel and The Jackal";
        paragraphs[16] = "A camel and a jackal were friends. One day the jackal took his friend to a big sugar-cane farm. It was on the opposite side of a river. After a sumptuous meal the jackal began to howl loudly. The frightened camel pleaded with the jackal not to do so. The jackal said, \"Friend, I have this habit after every meal. I cannot help it.\" Soon the farmers arrived and gave a sound thrashing to the camel. When the camel crossed the river the jackal joined him on his back. In the midstream the camel took a deliberate dip in the water. When the jackal cried out in terror, the camel said casually: \"I have the habit of rolling in the water after every meal.\" The poor jackal was drowned.";

        paraTitles[17] = "The Dog and The Cows";
        paragraphs[17] = "The cows used to eat hay from the manger. One day a herd of cows came to the manger to eat hay. They saw a dog lying on the hay in the manger. One of the cows pleaded, \"Please, will you get up! We are hungry. We have to eat our hay\". The dog did not take heed of it. Once again another cow pleaded, \"Please, let us have our hay\". The dog snarled and the cow stepped back. A wise cow ran up to the bull and told him the matter. The bull came and requested, \"Get out, please! Let them have their food\". There was no reply. The bull became angry. He bellowed loudly and stamped his legs. The dog got frightened and ran for his life.";

        paraTitles[18] = "The Donkey in Lion's Skin";
        paragraphs[18] = "A donkey dressed itself in a lion's skin. Wherever he went near the other animals and villagers feared him. Everyone thought that he was a real lion. Soon he became bold. But one day some farmers heard him braying. They ran after him with sticks. They beat him to death. Thus, the poor donkey paid the price for his foolishness.";

        paraTitles[19] = "The Cows and The Lion";
        paragraphs[19] = "There was a village near a jungle. The village cows used to go up to the jungle in search of food. In the forest there lived a wicked lion. He used to kill a cow now and then and eat her. This was happening for quite sometime. The cows were frightened. One day, all the cows held a meeting. An old cow said, \"Listen everybody, the lion eats one of us only because we go into the jungle separately. From now on we will all be together\". From then on all the cows went into the jungle in a herd. When they heard or saw the lion all of them unitedly moo and chased him away.";

        paraTitles[20] = "The Disobedient Son";
        paragraphs[20] = "Once there was a rich farmer in a village. He had a lot of land, cattle, money and many servants. He had two sons. He led a happy life with them. After few years, the younger of the two sons became unhappy. He asked his father for his share of property. His father advised him not demand like that. His mother also advised her son to do so. But he would not listen to his father???s words. He got his share and sold them. He had a huge amount with him. Once he got much money, he got bad company of friends. With this amount, he travelled to a distant country where he did all he wished. He had another bad company of friends there as well. Because of this, he fell into evil ways. All the money was gone. He became poor. AT that time, no one helped him out of bad company. Soon, he fell into debt. Then he understood his mistake and returned to his country and to his parents. He afterwards obeyed his parents and led a happy life.";

        paraTitles[21] = "Testing";
        paragraphs[21] = "Sample dfjfjiort jello kelllo, hello.";
    }
}
