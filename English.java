package umask;

import java.awt.event.KeyEvent;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class English extends javax.swing.JFrame{
    public String text = "";
    public String ButtonName;
    public char character ;
    public char ch;
    public int getAscii;
    public int shiftKey = 0;
    public static int Caps = 1;
    public String temp;
    public String insertText="";
    public String replaceText;
    public Connection con;
    public PreparedStatement ps;
    public int getSpace = 0;
    public int check4space=0;
    public int back = 0;
    //public Color shift_color;
    public English() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        initComponents();
    }
    public void display() throws SQLException
    {
        text = TextArea.getText();
        ch = character;
        getAscii = ch;
        if(Caps%2==0 || shiftKey==1){            //upper Case
            ch = (char) (getAscii-32);
            temp = Character.toString(ch);
            text = text+temp;
            shiftKey=0;
            changeToCaps();
        }
        else{                                   //smaller case
            temp = Character.toString(ch);
            text = text+temp;
        }
        //shift.setBackground(shift_color);
        TextArea.setText(text);
        performDictionary();
    }
    public void displayNumeric() throws SQLException
    {
        text = TextArea.getText();
        ch = character;
        temp = Character.toString(ch);
        text = text+temp;
        TextArea.setText(text);
        shiftKey=0;
        changeToCaps();
        performDictionary();
    }
    public void performDictionary() throws SQLException
    {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/diction_words","root","system");      
        insertText = TextArea.getText();
        if(check4space==1)
        {
            insertText= insertText.substring(getSpace+1,insertText.length());    
        }
        if(back==1)
        {
        insertText = insertText.substring(0,insertText.length()-1);
        }
        else
            back = 0;
        insertText = "'"+insertText+"%'";
        ps = con.prepareStatement("select * from diction where word like "+insertText+" limit 0,3");
        ResultSet rs = ps.executeQuery();
        int z1 = 1;
        while(rs.next())
        {
            String word_obtained = rs.getString("word");
            switch (z1) {
                case 1:
                    first_word.setText(word_obtained);
                    z1++;
                    break;
                case 2:
                    second_word.setText(word_obtained);
                    z1++;
                    break;
                default:
                    third_word.setText(word_obtained);
                    z1 = 1;
                    break;
            }
        }
    }
    public String callToChange(char change)
    {
        temp = Character.toString(change);
        return temp;
    }
    public void changeToCaps()
    {
        char change;
        if(Caps%2==0 || shiftKey==1){    //uppercase
        change = 65;
        }
        else{
            //caps.setBackground(shift_color);
            change = 97;
        }
        a.setText(callToChange(change));
        b.setText(callToChange(++change));
        c.setText(callToChange(++change));
        d.setText(callToChange(++change));
        e.setText(callToChange(++change));
        f.setText(callToChange(++change));
        g.setText(callToChange(++change));
        h.setText(callToChange(++change));
        i.setText(callToChange(++change));
        j.setText(callToChange(++change));
        k.setText(callToChange(++change));
        l.setText(callToChange(++change));
        m.setText(callToChange(++change));
        n.setText(callToChange(++change));
        o.setText(callToChange(++change));
        p.setText(callToChange(++change));
        q.setText(callToChange(++change));
        r.setText(callToChange(++change));
        s.setText(callToChange(++change));
        t.setText(callToChange(++change));
        u.setText(callToChange(++change));
        v.setText(callToChange(++change));
        w.setText(callToChange(++change));
        x.setText(callToChange(++change));
        y.setText(callToChange(++change));
        z.setText(callToChange(++change));    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        Numerics = new javax.swing.JPanel();
        tilde = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        a2j = new javax.swing.JPanel();
        tab = new javax.swing.JButton();
        a = new javax.swing.JButton();
        b = new javax.swing.JButton();
        c = new javax.swing.JButton();
        d = new javax.swing.JButton();
        e = new javax.swing.JButton();
        f = new javax.swing.JButton();
        g = new javax.swing.JButton();
        h = new javax.swing.JButton();
        i = new javax.swing.JButton();
        j = new javax.swing.JButton();
        Lsquare = new javax.swing.JButton();
        Rsquare = new javax.swing.JButton();
        Bslash = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        k2s = new javax.swing.JPanel();
        caps = new javax.swing.JButton();
        k = new javax.swing.JButton();
        l = new javax.swing.JButton();
        m = new javax.swing.JButton();
        n = new javax.swing.JButton();
        o = new javax.swing.JButton();
        p = new javax.swing.JButton();
        q = new javax.swing.JButton();
        r = new javax.swing.JButton();
        s = new javax.swing.JButton();
        semicolan = new javax.swing.JButton();
        Squote = new javax.swing.JButton();
        enter = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        t2z = new javax.swing.JPanel();
        shift = new javax.swing.JButton();
        t = new javax.swing.JButton();
        u = new javax.swing.JButton();
        v = new javax.swing.JButton();
        w = new javax.swing.JButton();
        x = new javax.swing.JButton();
        y = new javax.swing.JButton();
        z = new javax.swing.JButton();
        comma = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        Rslash = new javax.swing.JButton();
        Rshift = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        space = new javax.swing.JPanel();
        save = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        Space = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        clear_All = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        third_word = new javax.swing.JTextField();
        second_word = new javax.swing.JTextField();
        first_word = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UMASK ENGLISH");
        setResizable(false);

        TextArea.setEditable(false);
        TextArea.setColumns(20);
        TextArea.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        TextArea.setRows(5);
        TextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextAreaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(TextArea);

        Numerics.setBackground(new java.awt.Color(255, 255, 255));

        tilde.setBackground(new java.awt.Color(0, 0, 0));
        tilde.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tilde.setForeground(new java.awt.Color(255, 255, 255));
        tilde.setText("<html>~<br>`<br/><html>");
        tilde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tildeActionPerformed(evt);
            }
        });

        one.setBackground(new java.awt.Color(0, 0, 0));
        one.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        one.setForeground(new java.awt.Color(255, 255, 255));
        one.setText("<html>!<br>1<br/></html>");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setBackground(new java.awt.Color(0, 0, 0));
        two.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        two.setForeground(new java.awt.Color(255, 255, 255));
        two.setText("<html>@<br>2<br/></html>");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setBackground(new java.awt.Color(0, 0, 0));
        three.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        three.setForeground(new java.awt.Color(255, 255, 255));
        three.setText("<html>#<br>3<br/></html>");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        four.setBackground(new java.awt.Color(0, 0, 0));
        four.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        four.setForeground(new java.awt.Color(255, 255, 255));
        four.setText("<html>$<br>4<br/></html>");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setBackground(new java.awt.Color(0, 0, 0));
        five.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        five.setForeground(new java.awt.Color(255, 255, 255));
        five.setText("<html>%<br>5<br/></html>");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setBackground(new java.awt.Color(0, 0, 0));
        six.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        six.setForeground(new java.awt.Color(255, 255, 255));
        six.setText("<html>^<br>6<br/></html>");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        seven.setBackground(new java.awt.Color(0, 0, 0));
        seven.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        seven.setForeground(new java.awt.Color(255, 255, 255));
        seven.setText("<html>&<br>7<br/></html>");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setBackground(new java.awt.Color(0, 0, 0));
        eight.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eight.setForeground(new java.awt.Color(255, 255, 255));
        eight.setText("<html>*<br>8<br/></html>");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setBackground(new java.awt.Color(0, 0, 0));
        nine.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nine.setForeground(new java.awt.Color(255, 255, 255));
        nine.setText("<html>(<br>9<br/></html>");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        zero.setBackground(new java.awt.Color(0, 0, 0));
        zero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        zero.setForeground(new java.awt.Color(255, 255, 255));
        zero.setText("<html>)<br>0<br/></html>");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        minus.setBackground(new java.awt.Color(0, 0, 0));
        minus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        minus.setForeground(new java.awt.Color(255, 255, 255));
        minus.setText("<html>_<br>-<br/></html>");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        equal.setBackground(new java.awt.Color(0, 0, 0));
        equal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        equal.setForeground(new java.awt.Color(255, 255, 255));
        equal.setText("<html>+<br>=<br/></html>");
        equal.setMaximumSize(new java.awt.Dimension(55, 51));
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        backspace.setBackground(new java.awt.Color(0, 0, 0));
        backspace.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        backspace.setForeground(new java.awt.Color(255, 255, 255));
        backspace.setText("backspace");
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NumericsLayout = new javax.swing.GroupLayout(Numerics);
        Numerics.setLayout(NumericsLayout);
        NumericsLayout.setHorizontalGroup(
            NumericsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NumericsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tilde, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NumericsLayout.setVerticalGroup(
            NumericsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NumericsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NumericsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tilde)
                    .addComponent(minus, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(equal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(one)
                    .addComponent(two)
                    .addComponent(backspace, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zero)
                    .addComponent(nine, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eight, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seven, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(six, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(five)
                    .addComponent(four)
                    .addComponent(three, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );

        a2j.setBackground(new java.awt.Color(255, 255, 255));

        tab.setBackground(new java.awt.Color(0, 0, 0));
        tab.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tab.setForeground(new java.awt.Color(255, 255, 255));
        tab.setText("Tab");
        tab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabActionPerformed(evt);
            }
        });

        a.setBackground(new java.awt.Color(0, 0, 0));
        a.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 255));
        a.setText("a");
        a.setMaximumSize(new java.awt.Dimension(55, 51));
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });

        b.setBackground(new java.awt.Color(0, 0, 0));
        b.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b.setForeground(new java.awt.Color(255, 255, 255));
        b.setText("b");
        b.setMaximumSize(new java.awt.Dimension(55, 51));
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        c.setBackground(new java.awt.Color(0, 0, 0));
        c.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        c.setForeground(new java.awt.Color(255, 255, 255));
        c.setText("c");
        c.setMaximumSize(new java.awt.Dimension(55, 51));
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        d.setBackground(new java.awt.Color(0, 0, 0));
        d.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        d.setForeground(new java.awt.Color(255, 255, 255));
        d.setText("d");
        d.setMaximumSize(new java.awt.Dimension(55, 51));
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });

        e.setBackground(new java.awt.Color(0, 0, 0));
        e.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        e.setForeground(new java.awt.Color(255, 255, 255));
        e.setText("e");
        e.setMaximumSize(new java.awt.Dimension(55, 51));
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });

        f.setBackground(new java.awt.Color(0, 0, 0));
        f.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        f.setForeground(new java.awt.Color(255, 255, 255));
        f.setText("f");
        f.setMaximumSize(new java.awt.Dimension(55, 51));
        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });

        g.setBackground(new java.awt.Color(0, 0, 0));
        g.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        g.setForeground(new java.awt.Color(255, 255, 255));
        g.setText("g");
        g.setMaximumSize(new java.awt.Dimension(55, 51));
        g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gActionPerformed(evt);
            }
        });

        h.setBackground(new java.awt.Color(0, 0, 0));
        h.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        h.setForeground(new java.awt.Color(255, 255, 255));
        h.setText("h");
        h.setMaximumSize(new java.awt.Dimension(55, 51));
        h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hActionPerformed(evt);
            }
        });

        i.setBackground(new java.awt.Color(0, 0, 0));
        i.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        i.setForeground(new java.awt.Color(255, 255, 255));
        i.setText("i");
        i.setMaximumSize(new java.awt.Dimension(55, 51));
        i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iActionPerformed(evt);
            }
        });

        j.setBackground(new java.awt.Color(0, 0, 0));
        j.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        j.setForeground(new java.awt.Color(255, 255, 255));
        j.setText("j");
        j.setMaximumSize(new java.awt.Dimension(55, 51));
        j.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActionPerformed(evt);
            }
        });

        Lsquare.setBackground(new java.awt.Color(0, 0, 0));
        Lsquare.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lsquare.setForeground(new java.awt.Color(255, 255, 255));
        Lsquare.setText("<html>{<br>[<br/></html>");
        Lsquare.setMaximumSize(new java.awt.Dimension(55, 51));
        Lsquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LsquareActionPerformed(evt);
            }
        });

        Rsquare.setBackground(new java.awt.Color(0, 0, 0));
        Rsquare.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Rsquare.setForeground(new java.awt.Color(255, 255, 255));
        Rsquare.setText("<html>}<br>]<br/></html>");
        Rsquare.setMaximumSize(new java.awt.Dimension(55, 51));
        Rsquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RsquareActionPerformed(evt);
            }
        });

        Bslash.setBackground(new java.awt.Color(0, 0, 0));
        Bslash.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Bslash.setForeground(new java.awt.Color(255, 255, 255));
        Bslash.setText("<html>|<br>\\<br/></html>");
        Bslash.setMaximumSize(new java.awt.Dimension(55, 51));
        Bslash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BslashActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 102));
        jLabel15.setText("Q");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 102));
        jLabel16.setText("W");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 102));
        jLabel17.setText("E");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 102));
        jLabel18.setText("R");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 102));
        jLabel19.setText("T");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 102));
        jLabel20.setText("Y");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 102));
        jLabel21.setText("U");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 102));
        jLabel22.setText("I");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 102));
        jLabel23.setText("O");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 102));
        jLabel24.setText("P");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 102));
        jLabel25.setText("[");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 102));
        jLabel26.setText("]");

        jLabel27.setForeground(new java.awt.Color(0, 0, 102));
        jLabel27.setText("\\");

            javax.swing.GroupLayout a2jLayout = new javax.swing.GroupLayout(a2j);
            a2j.setLayout(a2jLayout);
            a2jLayout.setHorizontalGroup(
                a2jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(a2jLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(i, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(j, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Lsquare, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Rsquare, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Bslash, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, a2jLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(38, 38, 38)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(49, 49, 49)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(42, 42, 42)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(45, 45, 45)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(47, 47, 47)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(42, 42, 42)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(50, 50, 50)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(44, 44, 44)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(45, 45, 45))
            );
            a2jLayout.setVerticalGroup(
                a2jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(a2jLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(a2jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Lsquare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Rsquare, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(a, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                        .addComponent(b, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bslash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(j, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(i, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(g, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(f, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(e, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(d, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(c, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(a2jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)
                        .addComponent(jLabel20)
                        .addComponent(jLabel21)
                        .addComponent(jLabel22)
                        .addComponent(jLabel23)
                        .addComponent(jLabel24)
                        .addComponent(jLabel25)
                        .addComponent(jLabel26)
                        .addComponent(jLabel27)))
            );

            k2s.setBackground(new java.awt.Color(255, 255, 255));

            caps.setBackground(new java.awt.Color(0, 0, 0));
            caps.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            caps.setForeground(new java.awt.Color(255, 255, 255));
            caps.setText("Caps Lock");
            caps.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    capsActionPerformed(evt);
                }
            });

            k.setBackground(new java.awt.Color(0, 0, 0));
            k.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            k.setForeground(new java.awt.Color(255, 255, 255));
            k.setText("k");
            k.setMaximumSize(new java.awt.Dimension(55, 51));
            k.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    kActionPerformed(evt);
                }
            });

            l.setBackground(new java.awt.Color(0, 0, 0));
            l.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            l.setForeground(new java.awt.Color(255, 255, 255));
            l.setText("l");
            l.setMaximumSize(new java.awt.Dimension(55, 51));
            l.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    lActionPerformed(evt);
                }
            });

            m.setBackground(new java.awt.Color(0, 0, 0));
            m.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            m.setForeground(new java.awt.Color(255, 255, 255));
            m.setText("m");
            m.setMaximumSize(new java.awt.Dimension(55, 51));
            m.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    mActionPerformed(evt);
                }
            });

            n.setBackground(new java.awt.Color(0, 0, 0));
            n.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            n.setForeground(new java.awt.Color(255, 255, 255));
            n.setText("n");
            n.setMaximumSize(new java.awt.Dimension(55, 51));
            n.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    nActionPerformed(evt);
                }
            });

            o.setBackground(new java.awt.Color(0, 0, 0));
            o.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            o.setForeground(new java.awt.Color(255, 255, 255));
            o.setText("o");
            o.setMaximumSize(new java.awt.Dimension(55, 51));
            o.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    oActionPerformed(evt);
                }
            });

            p.setBackground(new java.awt.Color(0, 0, 0));
            p.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            p.setForeground(new java.awt.Color(255, 255, 255));
            p.setText("p");
            p.setMaximumSize(new java.awt.Dimension(55, 51));
            p.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    pActionPerformed(evt);
                }
            });

            q.setBackground(new java.awt.Color(0, 0, 0));
            q.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            q.setForeground(new java.awt.Color(255, 255, 255));
            q.setText("q");
            q.setMaximumSize(new java.awt.Dimension(55, 51));
            q.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    qActionPerformed(evt);
                }
            });

            r.setBackground(new java.awt.Color(0, 0, 0));
            r.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            r.setForeground(new java.awt.Color(255, 255, 255));
            r.setText("r");
            r.setMaximumSize(new java.awt.Dimension(55, 51));
            r.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    rActionPerformed(evt);
                }
            });

            s.setBackground(new java.awt.Color(0, 0, 0));
            s.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            s.setForeground(new java.awt.Color(255, 255, 255));
            s.setText("s");
            s.setMaximumSize(new java.awt.Dimension(55, 51));
            s.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    sActionPerformed(evt);
                }
            });

            semicolan.setBackground(new java.awt.Color(0, 0, 0));
            semicolan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            semicolan.setForeground(new java.awt.Color(255, 255, 255));
            semicolan.setText("<html>:<br>;<br/></html>");
            semicolan.setMaximumSize(new java.awt.Dimension(55, 51));
            semicolan.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    semicolanActionPerformed(evt);
                }
            });

            Squote.setBackground(new java.awt.Color(0, 0, 0));
            Squote.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            Squote.setForeground(new java.awt.Color(255, 255, 255));
            Squote.setText("<html>\"<br>'<br/></html>");
            Squote.setMaximumSize(new java.awt.Dimension(55, 51));
            Squote.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    SquoteActionPerformed(evt);
                }
            });

            enter.setBackground(new java.awt.Color(0, 0, 0));
            enter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            enter.setForeground(new java.awt.Color(255, 255, 255));
            enter.setText("Enter");
            enter.setMaximumSize(new java.awt.Dimension(55, 51));
            enter.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    enterActionPerformed(evt);
                }
            });

            jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel28.setForeground(new java.awt.Color(0, 0, 102));
            jLabel28.setText("A");

            jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel29.setForeground(new java.awt.Color(0, 0, 102));
            jLabel29.setText("S");

            jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel30.setForeground(new java.awt.Color(0, 0, 102));
            jLabel30.setText("D");

            jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel31.setForeground(new java.awt.Color(0, 0, 102));
            jLabel31.setText("F");

            jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel32.setForeground(new java.awt.Color(0, 0, 102));
            jLabel32.setText("G");

            jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel33.setForeground(new java.awt.Color(0, 0, 102));
            jLabel33.setText("H");

            jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel34.setText("J");

            jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel35.setForeground(new java.awt.Color(0, 0, 102));
            jLabel35.setText("K");

            jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel36.setForeground(new java.awt.Color(0, 0, 102));
            jLabel36.setText("L");

            jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel37.setForeground(new java.awt.Color(0, 0, 102));
            jLabel37.setText(";");

            jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel38.setForeground(new java.awt.Color(0, 0, 102));
            jLabel38.setText("'");

            javax.swing.GroupLayout k2sLayout = new javax.swing.GroupLayout(k2s);
            k2s.setLayout(k2sLayout);
            k2sLayout.setHorizontalGroup(
                k2sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(k2sLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(caps, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(o, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(q, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(r, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(s, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(semicolan, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Squote, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, k2sLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(51, 51, 51)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(45, 45, 45)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(45, 45, 45)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(48, 48, 48)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(50, 50, 50)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(48, 48, 48)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(43, 43, 43)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(51, 51, 51)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(45, 45, 45)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(133, 133, 133))
            );
            k2sLayout.setVerticalGroup(
                k2sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(k2sLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(k2sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(r, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(caps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(k, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                        .addComponent(l, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Squote, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(semicolan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(s, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(q, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(o, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(n, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(m, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(k2sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel28)
                        .addComponent(jLabel29)
                        .addComponent(jLabel30)
                        .addComponent(jLabel31)
                        .addComponent(jLabel32)
                        .addComponent(jLabel33)
                        .addComponent(jLabel34)
                        .addComponent(jLabel35)
                        .addComponent(jLabel36)
                        .addComponent(jLabel37)
                        .addComponent(jLabel38)))
            );

            t2z.setBackground(new java.awt.Color(255, 255, 255));

            shift.setBackground(new java.awt.Color(0, 0, 0));
            shift.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            shift.setForeground(new java.awt.Color(255, 255, 255));
            shift.setText("Shift");
            shift.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    shiftActionPerformed(evt);
                }
            });
            shift.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    shiftKeyReleased(evt);
                }
            });

            t.setBackground(new java.awt.Color(0, 0, 0));
            t.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            t.setForeground(new java.awt.Color(255, 255, 255));
            t.setText("t");
            t.setMaximumSize(new java.awt.Dimension(55, 51));
            t.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    tActionPerformed(evt);
                }
            });

            u.setBackground(new java.awt.Color(0, 0, 0));
            u.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            u.setForeground(new java.awt.Color(255, 255, 255));
            u.setText("u");
            u.setMaximumSize(new java.awt.Dimension(55, 51));
            u.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    uActionPerformed(evt);
                }
            });

            v.setBackground(new java.awt.Color(0, 0, 0));
            v.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            v.setForeground(new java.awt.Color(255, 255, 255));
            v.setText("v");
            v.setMaximumSize(new java.awt.Dimension(55, 51));
            v.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    vActionPerformed(evt);
                }
            });

            w.setBackground(new java.awt.Color(0, 0, 0));
            w.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            w.setForeground(new java.awt.Color(255, 255, 255));
            w.setText("w");
            w.setMaximumSize(new java.awt.Dimension(55, 51));
            w.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    wActionPerformed(evt);
                }
            });

            x.setBackground(new java.awt.Color(0, 0, 0));
            x.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            x.setForeground(new java.awt.Color(255, 255, 255));
            x.setText("x");
            x.setMaximumSize(new java.awt.Dimension(55, 51));
            x.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    xActionPerformed(evt);
                }
            });

            y.setBackground(new java.awt.Color(0, 0, 0));
            y.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            y.setForeground(new java.awt.Color(255, 255, 255));
            y.setText("y");
            y.setMaximumSize(new java.awt.Dimension(55, 51));
            y.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    yActionPerformed(evt);
                }
            });

            z.setBackground(new java.awt.Color(0, 0, 0));
            z.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            z.setForeground(new java.awt.Color(255, 255, 255));
            z.setText("z");
            z.setMaximumSize(new java.awt.Dimension(55, 51));
            z.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    zActionPerformed(evt);
                }
            });

            comma.setBackground(new java.awt.Color(0, 0, 0));
            comma.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            comma.setForeground(new java.awt.Color(255, 255, 255));
            comma.setText(",");
            comma.setMaximumSize(new java.awt.Dimension(55, 51));
            comma.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    commaActionPerformed(evt);
                }
            });

            dot.setBackground(new java.awt.Color(0, 0, 0));
            dot.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            dot.setForeground(new java.awt.Color(255, 255, 255));
            dot.setText("<html>><br>.<br/></html>");
            dot.setMaximumSize(new java.awt.Dimension(55, 51));
            dot.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    dotActionPerformed(evt);
                }
            });

            Rslash.setBackground(new java.awt.Color(0, 0, 0));
            Rslash.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            Rslash.setForeground(new java.awt.Color(255, 255, 255));
            Rslash.setText("<html>?<br>/<br/></html>");
            Rslash.setMaximumSize(new java.awt.Dimension(55, 51));
            Rslash.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    RslashActionPerformed(evt);
                }
            });

            Rshift.setBackground(new java.awt.Color(0, 0, 0));
            Rshift.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            Rshift.setForeground(new java.awt.Color(255, 255, 255));
            Rshift.setText("Shift");
            Rshift.setMaximumSize(new java.awt.Dimension(55, 51));
            Rshift.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    RshiftActionPerformed(evt);
                }
            });

            jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel39.setForeground(new java.awt.Color(0, 0, 102));
            jLabel39.setText("Z");

            jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel40.setForeground(new java.awt.Color(0, 0, 102));
            jLabel40.setText("X");

            jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel41.setForeground(new java.awt.Color(0, 0, 102));
            jLabel41.setText("C");

            jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel42.setForeground(new java.awt.Color(0, 0, 102));
            jLabel42.setText("V");

            jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel43.setForeground(new java.awt.Color(0, 0, 102));
            jLabel43.setText("B");

            jLabel44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel44.setForeground(new java.awt.Color(0, 0, 102));
            jLabel44.setText("N");

            jLabel45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel45.setForeground(new java.awt.Color(0, 0, 102));
            jLabel45.setText("M");

            jLabel46.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel46.setForeground(new java.awt.Color(0, 0, 102));
            jLabel46.setText(",");

            jLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel47.setForeground(new java.awt.Color(0, 0, 102));
            jLabel47.setText(".");

            jLabel48.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            jLabel48.setForeground(new java.awt.Color(0, 0, 102));
            jLabel48.setText("/");

            javax.swing.GroupLayout t2zLayout = new javax.swing.GroupLayout(t2z);
            t2z.setLayout(t2zLayout);
            t2zLayout.setHorizontalGroup(
                t2zLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t2zLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(u, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(v, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(w, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(z, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(comma, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Rslash, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Rshift, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, t2zLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(50, 50, 50)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(48, 48, 48)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(45, 45, 45)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(47, 47, 47)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(50, 50, 50)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(43, 43, 43)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(50, 50, 50)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(165, 165, 165))
            );
            t2zLayout.setVerticalGroup(
                t2zLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(t2zLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(t2zLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Rshift, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(shift, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(t, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                        .addComponent(u, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Rslash, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(z, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(y, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(x, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(w, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(v, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(t2zLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel39)
                        .addComponent(jLabel40)
                        .addComponent(jLabel41)
                        .addComponent(jLabel42)
                        .addComponent(jLabel43)
                        .addComponent(jLabel44)
                        .addComponent(jLabel45)
                        .addComponent(jLabel46)
                        .addComponent(jLabel47)
                        .addComponent(jLabel48))
                    .addContainerGap())
            );

            space.setBackground(new java.awt.Color(255, 255, 255));

            save.setBackground(new java.awt.Color(0, 0, 0));
            save.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            save.setForeground(new java.awt.Color(255, 255, 255));
            save.setText("Save");
            save.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    saveActionPerformed(evt);
                }
            });

            jButton31.setBackground(new java.awt.Color(0, 0, 0));
            jButton31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jButton31.setForeground(new java.awt.Color(255, 255, 255));
            jButton31.setText("X-keys");
            jButton31.setMaximumSize(new java.awt.Dimension(55, 51));
            jButton31.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton31ActionPerformed(evt);
                }
            });

            jButton32.setBackground(new java.awt.Color(0, 0, 0));
            jButton32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jButton32.setForeground(new java.awt.Color(255, 255, 255));
            jButton32.setText("Alt");
            jButton32.setMaximumSize(new java.awt.Dimension(55, 51));
            jButton32.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton32ActionPerformed(evt);
                }
            });

            Space.setBackground(new java.awt.Color(0, 0, 0));
            Space.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            Space.setForeground(new java.awt.Color(255, 255, 255));
            Space.setText("Space");
            Space.setMaximumSize(new java.awt.Dimension(55, 51));
            Space.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    SpaceActionPerformed(evt);
                }
            });

            jButton33.setBackground(new java.awt.Color(0, 0, 0));
            jButton33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jButton33.setForeground(new java.awt.Color(255, 255, 255));
            jButton33.setText("Alt");
            jButton33.setMaximumSize(new java.awt.Dimension(55, 51));
            jButton33.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton33ActionPerformed(evt);
                }
            });

            jButton34.setBackground(new java.awt.Color(0, 0, 0));
            jButton34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jButton34.setForeground(new java.awt.Color(255, 255, 255));
            jButton34.setText("Esc");
            jButton34.setMaximumSize(new java.awt.Dimension(55, 51));
            jButton34.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton34ActionPerformed(evt);
                }
            });

            clear_All.setBackground(new java.awt.Color(0, 0, 0));
            clear_All.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            clear_All.setForeground(new java.awt.Color(255, 255, 255));
            clear_All.setText("Clear all");
            clear_All.setMaximumSize(new java.awt.Dimension(55, 51));
            clear_All.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    clear_AllActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout spaceLayout = new javax.swing.GroupLayout(space);
            space.setLayout(spaceLayout);
            spaceLayout.setHorizontalGroup(
                spaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(spaceLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(Space, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(clear_All, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            spaceLayout.setVerticalGroup(
                spaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(spaceLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(spaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                        .addComponent(jButton32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clear_All, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Space, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
            );

            jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel1.setText("Choose your words :");

            third_word.setEditable(false);
            third_word.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            third_word.setText("Yogeshwaran");
            third_word.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
            third_word.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    third_wordMouseClicked(evt);
                }
            });

            second_word.setEditable(false);
            second_word.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            second_word.setText("AnanthaPerumal");
            second_word.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
            second_word.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    second_wordMouseClicked(evt);
                }
            });

            first_word.setEditable(false);
            first_word.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            first_word.setText("NithishKumar");
            first_word.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
            first_word.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    first_wordMouseClicked(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(k2s, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1)
                        .addComponent(a2j, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(t2z, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(space, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Numerics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(first_word, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(second_word, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(third_word, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(first_word, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(second_word, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(third_word, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(Numerics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(a2j, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(k2s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(t2z, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(space, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void tildeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tildeActionPerformed
        character = '`';
        if(shiftKey==1)
            character='~';
        try {
            displayNumeric();
        } 
        catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tildeActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        character = '1';
        if(shiftKey==1)
            character='!';
        try {
            displayNumeric();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_oneActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        character = '=';
        if(shiftKey==1)
            character='+';
        try {
            displayNumeric();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_equalActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        character = '2';
        if(shiftKey==1)
            character='@';
        try {
            displayNumeric();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        character = '3';
        if(shiftKey==1)
            character='#';
        try {
            displayNumeric();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        character = '4';
        if(shiftKey==1)
            character='$';
        try {
            displayNumeric();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        character = '5';
        if(shiftKey==1)
            character='%';
        try {
            displayNumeric();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        character = '6';
        if(shiftKey==1)
            character='^';
        try {
            displayNumeric();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        character = '7';
        if(shiftKey==1)
            character='&';
        try {
            displayNumeric();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        character = '8';
        if(shiftKey==1)
            character='*';
        try {
            displayNumeric();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eightActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        character = '0';
        if(shiftKey==1)
            character=')';
        try {
            displayNumeric();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_zeroActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        character = '-';
        if(shiftKey==1)
            character='_';
        try {
            displayNumeric();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_minusActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        character = '9';
        if(shiftKey==1)
            character='(';
        try {
            displayNumeric();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_nineActionPerformed

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed
        text = TextArea.getText();
        int length = text.length();
        if(text.charAt(length-1)==' ')
            check4space = 0;
        if(length>=1){
        text = text.substring(0,length-1);
        TextArea.setText(text);
        length = TextArea.getText().length();
        back = 1;
            try {
                if(length>0)
                    performDictionary();
            } 
            catch (SQLException ex) {
                Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_backspaceActionPerformed

    private void vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vActionPerformed
        character = 'v';
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_vActionPerformed

    private void shiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftActionPerformed
        shiftKey=1;
        changeToCaps();
    }//GEN-LAST:event_shiftActionPerformed

    private void tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tActionPerformed
        character = 't';
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tActionPerformed

    private void uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uActionPerformed
        character = 'u';
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_uActionPerformed

    private void wActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wActionPerformed
        character = 'w';
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_wActionPerformed

    private void xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xActionPerformed
        character = 'x';
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_xActionPerformed

    private void zActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zActionPerformed
        character = 'z';
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_zActionPerformed

    private void yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yActionPerformed
        character = 'y';
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_yActionPerformed

    private void commaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commaActionPerformed
        character = ',';
        if(shiftKey==1)
            character='<';
        try {
            displayNumeric();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_commaActionPerformed

    private void RslashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RslashActionPerformed
        character = '/';
        if(shiftKey==1)
            character='?';
        try {
            displayNumeric();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RslashActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
        character = '.';
        if(shiftKey==1)
            character='>';
        try {
            displayNumeric();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dotActionPerformed

    private void RshiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RshiftActionPerformed
        shiftActionPerformed(evt);
    }//GEN-LAST:event_RshiftActionPerformed

    private void mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActionPerformed
        character = 'm';
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mActionPerformed

    private void capsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capsActionPerformed
        Caps++;
        changeToCaps();
    }//GEN-LAST:event_capsActionPerformed

    private void kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kActionPerformed
        character = 'k';
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_kActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
            text = TextArea.getText();
            text = text+"\n";
            TextArea.setText(text);
    }//GEN-LAST:event_enterActionPerformed

    private void lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lActionPerformed
        character = 'l';
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lActionPerformed

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        character = 'n';
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_nActionPerformed

    private void oActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oActionPerformed
        character = 'o';
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_oActionPerformed

    private void qActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qActionPerformed
        character = 'q';
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_qActionPerformed

    private void pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pActionPerformed
        character = 'p';
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pActionPerformed

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
        character = 's';
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sActionPerformed

    private void SquoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SquoteActionPerformed
        String exceptional = "'";
        if(shiftKey==1){
            character='"';
            try {
                displayNumeric();
            } catch (SQLException ex) {
                Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            text = TextArea.getText();
            TextArea.setText(text+exceptional);
        }
    }//GEN-LAST:event_SquoteActionPerformed

    private void semicolanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semicolanActionPerformed
        character = ';';
        if(shiftKey==1)
            character=':';
        try {
            displayNumeric();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_semicolanActionPerformed

    private void rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rActionPerformed
        character = 'r';
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        character = 'c';
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cActionPerformed

    private void tabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabActionPerformed
        text = TextArea.getText();
        TextArea.setText(text+"             ");
    }//GEN-LAST:event_tabActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        character = 'a';
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_aActionPerformed

    private void RsquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RsquareActionPerformed
        character = ']';
        if(shiftKey==1)
            character='}';
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RsquareActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        character = 'b';
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        character = 'd';
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        character = 'e';
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eActionPerformed

    private void gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gActionPerformed
        character = 'g';
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_gActionPerformed

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
        character = 'f';
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_fActionPerformed

    private void hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hActionPerformed
        character = 'h';
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_hActionPerformed

    private void jActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActionPerformed
        character = 'j';
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jActionPerformed

    private void iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iActionPerformed
        character = 'i';
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iActionPerformed

    private void BslashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BslashActionPerformed
        character = '\\';
        if(shiftKey==1)
            character='|';
        try {
            displayNumeric();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BslashActionPerformed

    private void LsquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LsquareActionPerformed
        character = '[';
        if(shiftKey==1)
            character='{';
        try {
            displayNumeric();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LsquareActionPerformed

    private void SpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpaceActionPerformed
        check4space=1;
        text = TextArea.getText();
        getSpace = text.length();
        //System.out.println(getSpace+" when space clicked");
        TextArea.setText(text+' ');
    }//GEN-LAST:event_SpaceActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        BufferedWriter bw = null;
        try {
            File filepath = null;
            JFileChooser jf = new JFileChooser();
            int c1 = jf.showSaveDialog(null);
            if(c1==JFileChooser.APPROVE_OPTION)
            {
                filepath = jf.getSelectedFile();
                //System.out.println(filepath);
            }   
            text = TextArea.getText();
            bw = new BufferedWriter(new FileWriter(filepath) );
            bw.write(text);
            JOptionPane.showMessageDialog(null,"FileSaved","Message",JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (IOException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally {
            try {
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_saveActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton34ActionPerformed

    private void clear_AllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_AllActionPerformed
        TextArea.setText("");
        check4space = 0;
        back = 0;
    }//GEN-LAST:event_clear_AllActionPerformed

    private void shiftKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_shiftKeyReleased
                a.setText("a");
    }//GEN-LAST:event_shiftKeyReleased
public void KeyPerformed(char c)
{
    text = TextArea.getText();
    character = c;
        try {
            display();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
}
public void KeyPerformed1(char c1){
    text = TextArea.getText();
    character = c1;
        try {
            displayNumeric();
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    private void TextAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextAreaKeyPressed
        char getChar = evt.getKeyChar();
        char check;
        if(evt.getKeyCode()==KeyEvent.VK_SHIFT){
            shiftKey = 1;
            changeToCaps();
        }
        if(evt.getKeyCode()==KeyEvent.VK_BACK_SPACE){
        int length1 = text.length();
        text = text.substring(0,length1-1);
        TextArea.setText(text); 
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            text = TextArea.getText();
            TextArea.setText(text+"\n");
        }
        if(evt.getKeyCode()==KeyEvent.VK_SPACE)
        {
            text = TextArea.getText();
            TextArea.setText(text+" ");
        }
        if(evt.getKeyCode()==KeyEvent.VK_CAPS_LOCK)
        {
            Caps++;
            changeToCaps();
        }
        switch (getChar) {
            case 'q':
                check = 'a';
                KeyPerformed(check);
                break;
            case 'w':
                check = 'b';
                KeyPerformed(check);
                break;
            case 'e':
                check = 'c';
                KeyPerformed(check);
                break;
            case 'r':
                check = 'd';
                KeyPerformed(check);
                break;
            case 't':
                check = 'e';
                KeyPerformed(check);
                break;
            case 'y':
                check = 'f';
                KeyPerformed(check);
                break;
            case 'u':
                check = 'g';
                KeyPerformed(check);
                break;
            case 'i':
                check = 'h';
                KeyPerformed(check);
                break;
            case 'o':
                check = 'i';
                KeyPerformed(check);
                break;
            case 'p':
                check = 'j';
                KeyPerformed(check);
                break;
            case 'a':
                check = 'k';
                KeyPerformed(check);
                break;
            case 's':
                check = 'l';
                KeyPerformed(check);
                break;
            case 'd':
                check = 'm';
                KeyPerformed(check);
                break;
            case 'f':
                check = 'n';
                KeyPerformed(check);
                break;
            case 'g':
                check = 'o';
                KeyPerformed(check);
                break;
            case 'h':
                check = 'p';
                KeyPerformed(check);
                break;
            case 'j':
                check = 'q';
                KeyPerformed(check);
                break;
            case 'k':
                check = 'r';
                KeyPerformed(check);
                break;
            case 'l':
                check = 's';
                KeyPerformed(check);
                break;
            case 'z':
                check = 't';
                KeyPerformed(check);
                break;
            case 'x':
                check = 'u';
                KeyPerformed(check);
                break;
            case 'c':
                check = 'v';
                KeyPerformed(check);
                break;
            case 'v':
                check = 'w';
                KeyPerformed(check);
                break;
            case 'b':
                check = 'x';
                KeyPerformed(check);
                break;
            case 'n':
                check = 'y';
                KeyPerformed(check);
                break;
            case 'm':
                check = 'z';
                KeyPerformed(check);
                break;
            case '1':
                if(shiftKey==1)
                    check = '!';
                else
                    check = '1';
                KeyPerformed1(check);
                break;
            case '2':
                if(shiftKey==1)
                    check = '@';
                else
                    check = '2';
                KeyPerformed1(check);
                break;
            case '3':
                if(shiftKey==1)
                    check = '#';
                else
                    check = '3';
                KeyPerformed1(check);
                break;
            case '4':
                if(shiftKey==1)
                    check = '$';
                else
                    check = '4';
                KeyPerformed1(check);
                break;
            case '5':
                if(shiftKey==1)
                    check = '%';
                else
                    check = '5';
                KeyPerformed1(check);
                break;
            case '6':
                if(shiftKey==1)
                    check = '^';
                else
                    check = '6';
                KeyPerformed1(check);
                break;
            case '7':
                if(shiftKey==1)
                    check = '&';
                else
                    check = '7';
                KeyPerformed1(check);
                break;
            case '8':
                if(shiftKey==1)
                    check = '*';
                else
                    check = '8';
                KeyPerformed1(check);
                break;
            case '9':
                if(shiftKey==1)
                    check = '(';
                else
                    check = '9';
                KeyPerformed1(check);
                break;
            case '0':
                if(shiftKey==1)
                    check = ')';
                else
                    check = '0';
                KeyPerformed1(check);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_TextAreaKeyPressed

    private void first_wordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_first_wordMouseClicked
        replaceText = first_word.getText();
        text = TextArea.getText();
        if(getSpace>0)
            text = text.substring(0,getSpace);
        if(check4space==1){
            TextArea.setText(text+" "+replaceText);
        }
        else
            TextArea.setText(replaceText);
    }//GEN-LAST:event_first_wordMouseClicked

    private void second_wordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_second_wordMouseClicked
        replaceText = second_word.getText();
        text = TextArea.getText();
        if(getSpace>0)
            text = text.substring(0,getSpace);
        if(check4space==1){
            TextArea.setText(text+" "+replaceText);
        }
        else
            TextArea.setText(replaceText);
    }//GEN-LAST:event_second_wordMouseClicked

    private void third_wordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_third_wordMouseClicked
        replaceText = third_word.getText();
        text = TextArea.getText();
        if(getSpace>0)
            text = text.substring(0,getSpace);
        if(check4space==1){
            TextArea.setText(text+" "+replaceText);
        }
        else
            TextArea.setText(replaceText);
    }//GEN-LAST:event_third_wordMouseClicked

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
            java.util.logging.Logger.getLogger(LayoutsPanels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new English().setVisible(true);
            } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bslash;
    private javax.swing.JButton Lsquare;
    private javax.swing.JPanel Numerics;
    private javax.swing.JButton Rshift;
    private javax.swing.JButton Rslash;
    private javax.swing.JButton Rsquare;
    private javax.swing.JButton Space;
    private javax.swing.JButton Squote;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton a;
    private javax.swing.JPanel a2j;
    private javax.swing.JButton b;
    private javax.swing.JButton backspace;
    private javax.swing.JButton c;
    private javax.swing.JButton caps;
    private javax.swing.JButton clear_All;
    private javax.swing.JButton comma;
    private javax.swing.JButton d;
    private javax.swing.JButton dot;
    private javax.swing.JButton e;
    private javax.swing.JButton eight;
    private javax.swing.JButton enter;
    private javax.swing.JButton equal;
    private javax.swing.JButton f;
    private javax.swing.JTextField first_word;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton g;
    private javax.swing.JButton h;
    private javax.swing.JButton i;
    private javax.swing.JButton j;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton k;
    private javax.swing.JPanel k2s;
    private javax.swing.JButton l;
    private javax.swing.JButton m;
    private javax.swing.JButton minus;
    private javax.swing.JButton n;
    private javax.swing.JButton nine;
    private javax.swing.JButton o;
    private javax.swing.JButton one;
    private javax.swing.JButton p;
    private javax.swing.JButton q;
    private javax.swing.JButton r;
    private javax.swing.JButton s;
    private javax.swing.JButton save;
    private javax.swing.JTextField second_word;
    private javax.swing.JButton semicolan;
    private javax.swing.JButton seven;
    private javax.swing.JButton shift;
    private javax.swing.JButton six;
    private javax.swing.JPanel space;
    private javax.swing.JButton t;
    private javax.swing.JPanel t2z;
    private javax.swing.JButton tab;
    private javax.swing.JTextField third_word;
    private javax.swing.JButton three;
    private javax.swing.JButton tilde;
    private javax.swing.JButton two;
    private javax.swing.JButton u;
    private javax.swing.JButton v;
    private javax.swing.JButton w;
    private javax.swing.JButton x;
    private javax.swing.JButton y;
    private javax.swing.JButton z;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
