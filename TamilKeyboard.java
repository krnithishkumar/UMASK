package umask;

import com.sun.glass.events.KeyEvent;

public class TamilKeyboard extends javax.swing.JFrame {
    public int uyir = 0;
    public TamilKeyboard() {
        initComponents();
    }
    public String s1,s2,s3;
    public int shift=0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Text = new javax.swing.JTextArea();
        Numerics = new javax.swing.JPanel();
        Esc_ = new javax.swing.JButton();
        one_ = new javax.swing.JButton();
        comma_ = new javax.swing.JButton();
        Two_ = new javax.swing.JButton();
        Three_ = new javax.swing.JButton();
        Four_ = new javax.swing.JButton();
        Five_ = new javax.swing.JButton();
        Six_ = new javax.swing.JButton();
        Seven_ = new javax.swing.JButton();
        Eight_ = new javax.swing.JButton();
        Zero_ = new javax.swing.JButton();
        NIne_ = new javax.swing.JButton();
        BackSpace_ = new javax.swing.JButton();
        dot_ = new javax.swing.JButton();
        Shift_ = new javax.swing.JPanel();
        va_ = new javax.swing.JButton();
        shift_ = new javax.swing.JButton();
        ra_ = new javax.swing.JButton();
        la_ = new javax.swing.JButton();
        laa_ = new javax.swing.JButton();
        laaa_ = new javax.swing.JButton();
        naa_ = new javax.swing.JButton();
        raa_ = new javax.swing.JButton();
        jaa_ = new javax.swing.JButton();
        sa_ = new javax.swing.JButton();
        sri_ = new javax.swing.JButton();
        clear_all = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        caps_ = new javax.swing.JPanel();
        chaa_ = new javax.swing.JButton();
        Caps_ = new javax.swing.JButton();
        ka_ = new javax.swing.JButton();
        Enter_ = new javax.swing.JButton();
        nza_ = new javax.swing.JButton();
        nzaa_ = new javax.swing.JButton();
        ta_ = new javax.swing.JButton();
        tha_ = new javax.swing.JButton();
        naaa_ = new javax.swing.JButton();
        na_ = new javax.swing.JButton();
        ma_ = new javax.swing.JButton();
        pa_ = new javax.swing.JButton();
        ya_ = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
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
        Tab_ = new javax.swing.JPanel();
        ee_ = new javax.swing.JButton();
        tab_ = new javax.swing.JButton();
        a_ = new javax.swing.JButton();
        avvvv_ = new javax.swing.JButton();
        aaa_ = new javax.swing.JButton();
        eeee_ = new javax.swing.JButton();
        uu_ = new javax.swing.JButton();
        aee_ = new javax.swing.JButton();
        uuuuu_ = new javax.swing.JButton();
        aeee_ = new javax.swing.JButton();
        oo_ = new javax.swing.JButton();
        ai_ = new javax.swing.JButton();
        aku_ = new javax.swing.JButton();
        ooooo_ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Space_ = new javax.swing.JPanel();
        space_ = new javax.swing.JButton();
        ctrl_ = new javax.swing.JButton();
        tamil_ = new javax.swing.JButton();
        alt_ = new javax.swing.JButton();
        Left_ = new javax.swing.JButton();
        Down_ = new javax.swing.JButton();
        Right_ = new javax.swing.JButton();
        Up_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UMASK TAMIL");
        setResizable(false);

        Text.setEditable(false);
        Text.setColumns(20);
        Text.setFont(new java.awt.Font("Baamini", 0, 24)); // NOI18N
        Text.setRows(5);
        Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(Text);

        Numerics.setBackground(new java.awt.Color(255, 255, 255));

        Esc_.setBackground(new java.awt.Color(0, 0, 0));
        Esc_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Esc_.setForeground(new java.awt.Color(255, 255, 255));
        Esc_.setText("Esc");
        Esc_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Esc_ActionPerformed(evt);
            }
        });

        one_.setBackground(new java.awt.Color(0, 0, 0));
        one_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        one_.setForeground(new java.awt.Color(255, 255, 255));
        one_.setText("1  ");
        one_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one_ActionPerformed(evt);
            }
        });

        comma_.setBackground(new java.awt.Color(0, 0, 0));
        comma_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comma_.setForeground(new java.awt.Color(255, 255, 255));
        comma_.setText(",");
        comma_.setMaximumSize(new java.awt.Dimension(55, 51));
        comma_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comma_ActionPerformed(evt);
            }
        });

        Two_.setBackground(new java.awt.Color(0, 0, 0));
        Two_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Two_.setForeground(new java.awt.Color(255, 255, 255));
        Two_.setText("2");
        Two_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Two_ActionPerformed(evt);
            }
        });

        Three_.setBackground(new java.awt.Color(0, 0, 0));
        Three_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Three_.setForeground(new java.awt.Color(255, 255, 255));
        Three_.setText("3");
        Three_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Three_ActionPerformed(evt);
            }
        });

        Four_.setBackground(new java.awt.Color(0, 0, 0));
        Four_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Four_.setForeground(new java.awt.Color(255, 255, 255));
        Four_.setText("4");
        Four_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Four_ActionPerformed(evt);
            }
        });

        Five_.setBackground(new java.awt.Color(0, 0, 0));
        Five_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Five_.setForeground(new java.awt.Color(255, 255, 255));
        Five_.setText("5");
        Five_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Five_ActionPerformed(evt);
            }
        });

        Six_.setBackground(new java.awt.Color(0, 0, 0));
        Six_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Six_.setForeground(new java.awt.Color(255, 255, 255));
        Six_.setText("6");
        Six_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Six_ActionPerformed(evt);
            }
        });

        Seven_.setBackground(new java.awt.Color(0, 0, 0));
        Seven_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Seven_.setForeground(new java.awt.Color(255, 255, 255));
        Seven_.setText("7");
        Seven_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seven_ActionPerformed(evt);
            }
        });

        Eight_.setBackground(new java.awt.Color(0, 0, 0));
        Eight_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Eight_.setForeground(new java.awt.Color(255, 255, 255));
        Eight_.setText("8");
        Eight_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eight_ActionPerformed(evt);
            }
        });

        Zero_.setBackground(new java.awt.Color(0, 0, 0));
        Zero_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Zero_.setForeground(new java.awt.Color(255, 255, 255));
        Zero_.setText("0");
        Zero_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Zero_ActionPerformed(evt);
            }
        });

        NIne_.setBackground(new java.awt.Color(0, 0, 0));
        NIne_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NIne_.setForeground(new java.awt.Color(255, 255, 255));
        NIne_.setText("9");
        NIne_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NIne_ActionPerformed(evt);
            }
        });

        BackSpace_.setBackground(new java.awt.Color(0, 0, 0));
        BackSpace_.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BackSpace_.setForeground(new java.awt.Color(255, 255, 255));
        BackSpace_.setText("BackSpace");
        BackSpace_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackSpace_ActionPerformed(evt);
            }
        });

        dot_.setBackground(new java.awt.Color(0, 0, 0));
        dot_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dot_.setForeground(new java.awt.Color(255, 255, 255));
        dot_.setText(".");
        dot_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dot_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NumericsLayout = new javax.swing.GroupLayout(Numerics);
        Numerics.setLayout(NumericsLayout);
        NumericsLayout.setHorizontalGroup(
            NumericsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NumericsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Esc_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(one_, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Two_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Three_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Four_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Five_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Six_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Seven_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Eight_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NIne_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Zero_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dot_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comma_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BackSpace_)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NumericsLayout.setVerticalGroup(
            NumericsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NumericsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NumericsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dot_, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(comma_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Esc_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(one_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Two_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BackSpace_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Zero_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NIne_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Eight_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Seven_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Six_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Five_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Four_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Three_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Shift_.setBackground(new java.awt.Color(255, 255, 255));

        va_.setBackground(new java.awt.Color(0, 0, 0));
        va_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        va_.setForeground(new java.awt.Color(255, 255, 255));
        va_.setText("t");
        va_.setMaximumSize(new java.awt.Dimension(55, 51));
        va_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                va_ActionPerformed(evt);
            }
        });

        shift_.setBackground(new java.awt.Color(0, 0, 0));
        shift_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        shift_.setForeground(new java.awt.Color(255, 255, 255));
        shift_.setText("Shift");
        shift_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shift_ActionPerformed(evt);
            }
        });

        ra_.setBackground(new java.awt.Color(0, 0, 0));
        ra_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        ra_.setForeground(new java.awt.Color(255, 255, 255));
        ra_.setText("u");
        ra_.setMaximumSize(new java.awt.Dimension(55, 51));
        ra_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ra_ActionPerformed(evt);
            }
        });

        la_.setBackground(new java.awt.Color(0, 0, 0));
        la_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        la_.setForeground(new java.awt.Color(255, 255, 255));
        la_.setText("y");
        la_.setMaximumSize(new java.awt.Dimension(55, 51));
        la_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                la_ActionPerformed(evt);
            }
        });

        laa_.setBackground(new java.awt.Color(0, 0, 0));
        laa_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        laa_.setForeground(new java.awt.Color(255, 255, 255));
        laa_.setText("o");
        laa_.setMaximumSize(new java.awt.Dimension(55, 51));
        laa_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laa_ActionPerformed(evt);
            }
        });

        laaa_.setBackground(new java.awt.Color(0, 0, 0));
        laaa_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        laaa_.setForeground(new java.awt.Color(255, 255, 255));
        laaa_.setText("s");
        laaa_.setMaximumSize(new java.awt.Dimension(55, 51));
        laaa_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laaa_ActionPerformed(evt);
            }
        });

        naa_.setBackground(new java.awt.Color(0, 0, 0));
        naa_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        naa_.setForeground(new java.awt.Color(255, 255, 255));
        naa_.setText("d");
        naa_.setMaximumSize(new java.awt.Dimension(55, 51));
        naa_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naa_ActionPerformed(evt);
            }
        });

        raa_.setBackground(new java.awt.Color(0, 0, 0));
        raa_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        raa_.setForeground(new java.awt.Color(255, 255, 255));
        raa_.setText("w");
        raa_.setMaximumSize(new java.awt.Dimension(55, 51));
        raa_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raa_ActionPerformed(evt);
            }
        });

        jaa_.setBackground(new java.awt.Color(0, 0, 0));
        jaa_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        jaa_.setForeground(new java.awt.Color(255, 255, 255));
        jaa_.setText("[");
        jaa_.setMaximumSize(new java.awt.Dimension(55, 51));
        jaa_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaa_ActionPerformed(evt);
            }
        });

        sa_.setBackground(new java.awt.Color(0, 0, 0));
        sa_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        sa_.setForeground(new java.awt.Color(255, 255, 255));
        sa_.setText("]");
        sa_.setMaximumSize(new java.awt.Dimension(55, 51));
        sa_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sa_ActionPerformed(evt);
            }
        });

        sri_.setBackground(new java.awt.Color(0, 0, 0));
        sri_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        sri_.setForeground(new java.awt.Color(255, 255, 255));
        sri_.setText("=");
        sri_.setMaximumSize(new java.awt.Dimension(55, 51));
        sri_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sri_ActionPerformed(evt);
            }
        });

        clear_all.setBackground(new java.awt.Color(0, 0, 0));
        clear_all.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        clear_all.setForeground(new java.awt.Color(255, 255, 255));
        clear_all.setText("clear all");
        clear_all.setMaximumSize(new java.awt.Dimension(55, 51));
        clear_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_allActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 102));
        jLabel26.setText("Z");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 102));
        jLabel27.setText("X");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 102));
        jLabel28.setText("C");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 102));
        jLabel29.setText("V");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 102));
        jLabel30.setText("B");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 102));
        jLabel31.setText("N");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 102));
        jLabel32.setText("M");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 102));
        jLabel33.setText(",");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 102));
        jLabel34.setText(".");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 102));
        jLabel35.setText("/");

        javax.swing.GroupLayout Shift_Layout = new javax.swing.GroupLayout(Shift_);
        Shift_.setLayout(Shift_Layout);
        Shift_Layout.setHorizontalGroup(
            Shift_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Shift_Layout.createSequentialGroup()
                .addGroup(Shift_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Shift_Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(shift_, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ra_, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(la_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(va_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(laa_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(laaa_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(raa_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(naa_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jaa_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sri_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sa_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clear_all, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Shift_Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Shift_Layout.setVerticalGroup(
            Shift_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Shift_Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Shift_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clear_all, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shift_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ra_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(la_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sa_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sri_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jaa_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(naa_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(raa_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(laaa_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(laa_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(va_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Shift_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)))
        );

        caps_.setBackground(new java.awt.Color(255, 255, 255));

        chaa_.setBackground(new java.awt.Color(0, 0, 0));
        chaa_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        chaa_.setForeground(new java.awt.Color(255, 255, 255));
        chaa_.setText("r");
        chaa_.setMaximumSize(new java.awt.Dimension(55, 51));
        chaa_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chaa_ActionPerformed(evt);
            }
        });

        Caps_.setBackground(new java.awt.Color(0, 0, 0));
        Caps_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Caps_.setForeground(new java.awt.Color(255, 255, 255));
        Caps_.setText("caps");
        Caps_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caps_ActionPerformed(evt);
            }
        });

        ka_.setBackground(new java.awt.Color(0, 0, 0));
        ka_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        ka_.setForeground(new java.awt.Color(255, 255, 255));
        ka_.setText("f");
        ka_.setMaximumSize(new java.awt.Dimension(55, 51));
        ka_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ka_ActionPerformed(evt);
            }
        });

        Enter_.setBackground(new java.awt.Color(0, 0, 0));
        Enter_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Enter_.setForeground(new java.awt.Color(255, 255, 255));
        Enter_.setText("Enter");
        Enter_.setMaximumSize(new java.awt.Dimension(55, 51));
        Enter_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enter_ActionPerformed(evt);
            }
        });

        nza_.setBackground(new java.awt.Color(0, 0, 0));
        nza_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        nza_.setForeground(new java.awt.Color(255, 255, 255));
        nza_.setText("q");
        nza_.setMaximumSize(new java.awt.Dimension(55, 51));
        nza_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nza_ActionPerformed(evt);
            }
        });

        nzaa_.setBackground(new java.awt.Color(0, 0, 0));
        nzaa_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        nzaa_.setForeground(new java.awt.Color(255, 255, 255));
        nzaa_.setText("Q");
        nzaa_.setMaximumSize(new java.awt.Dimension(55, 51));
        nzaa_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nzaa_ActionPerformed(evt);
            }
        });

        ta_.setBackground(new java.awt.Color(0, 0, 0));
        ta_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        ta_.setForeground(new java.awt.Color(255, 255, 255));
        ta_.setText("l");
        ta_.setMaximumSize(new java.awt.Dimension(55, 51));
        ta_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ta_ActionPerformed(evt);
            }
        });

        tha_.setBackground(new java.awt.Color(0, 0, 0));
        tha_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        tha_.setForeground(new java.awt.Color(255, 255, 255));
        tha_.setText("j");
        tha_.setMaximumSize(new java.awt.Dimension(55, 51));
        tha_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tha_ActionPerformed(evt);
            }
        });

        naaa_.setBackground(new java.awt.Color(0, 0, 0));
        naaa_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        naaa_.setForeground(new java.awt.Color(255, 255, 255));
        naaa_.setText("z");
        naaa_.setMaximumSize(new java.awt.Dimension(55, 51));
        naaa_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naaa_ActionPerformed(evt);
            }
        });

        na_.setBackground(new java.awt.Color(0, 0, 0));
        na_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        na_.setForeground(new java.awt.Color(255, 255, 255));
        na_.setText("e");
        na_.setMaximumSize(new java.awt.Dimension(55, 51));
        na_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                na_ActionPerformed(evt);
            }
        });

        ma_.setBackground(new java.awt.Color(0, 0, 0));
        ma_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        ma_.setForeground(new java.awt.Color(255, 255, 255));
        ma_.setText("k");
        ma_.setMaximumSize(new java.awt.Dimension(55, 51));
        ma_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ma_ActionPerformed(evt);
            }
        });

        pa_.setBackground(new java.awt.Color(0, 0, 0));
        pa_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        pa_.setForeground(new java.awt.Color(255, 255, 255));
        pa_.setText("g");
        pa_.setMaximumSize(new java.awt.Dimension(55, 51));
        pa_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pa_ActionPerformed(evt);
            }
        });

        ya_.setBackground(new java.awt.Color(0, 0, 0));
        ya_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        ya_.setForeground(new java.awt.Color(255, 255, 255));
        ya_.setText("a");
        ya_.setMaximumSize(new java.awt.Dimension(55, 51));
        ya_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ya_ActionPerformed(evt);
            }
        });

        jLabel3.setText("Q");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 102));
        jLabel15.setText("A");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 102));
        jLabel16.setText("S");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 102));
        jLabel17.setText("D");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 102));
        jLabel18.setText("F");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 102));
        jLabel19.setText("G");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 102));
        jLabel20.setText("H");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 102));
        jLabel21.setText("J");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 102));
        jLabel22.setText("K");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 102));
        jLabel23.setText("L");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 102));
        jLabel24.setText(";");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 102));
        jLabel25.setText("'");

        javax.swing.GroupLayout caps_Layout = new javax.swing.GroupLayout(caps_);
        caps_.setLayout(caps_Layout);
        caps_Layout.setHorizontalGroup(
            caps_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(caps_Layout.createSequentialGroup()
                .addGroup(caps_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(caps_Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Caps_, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ka_, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(nza_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chaa_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nzaa_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ta_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(naaa_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tha_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(na_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pa_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ma_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ya_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Enter_, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(caps_Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(caps_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(caps_Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        caps_Layout.setVerticalGroup(
            caps_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(caps_Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(caps_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ya_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Enter_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Caps_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ka_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(nza_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ma_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pa_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(na_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tha_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(naaa_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ta_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nzaa_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chaa_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(caps_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)))
            .addGroup(caps_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(caps_Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Tab_.setBackground(new java.awt.Color(255, 255, 255));

        ee_.setBackground(new java.awt.Color(0, 0, 0));
        ee_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        ee_.setForeground(new java.awt.Color(255, 255, 255));
        ee_.setText(",");
        ee_.setMaximumSize(new java.awt.Dimension(55, 51));
        ee_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ee_ActionPerformed(evt);
            }
        });

        tab_.setBackground(new java.awt.Color(0, 0, 0));
        tab_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tab_.setForeground(new java.awt.Color(255, 255, 255));
        tab_.setText("Tab");
        tab_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab_ActionPerformed(evt);
            }
        });

        a_.setBackground(new java.awt.Color(0, 0, 0));
        a_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        a_.setForeground(new java.awt.Color(255, 255, 255));
        a_.setText("m");
        a_.setMaximumSize(new java.awt.Dimension(55, 51));
        a_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_ActionPerformed(evt);
            }
        });

        avvvv_.setBackground(new java.awt.Color(0, 0, 0));
        avvvv_.setFont(new java.awt.Font("Baamini", 0, 14)); // NOI18N
        avvvv_.setForeground(new java.awt.Color(255, 255, 255));
        avvvv_.setText("xs");
        avvvv_.setMaximumSize(new java.awt.Dimension(55, 51));
        avvvv_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avvvv_ActionPerformed(evt);
            }
        });

        aaa_.setBackground(new java.awt.Color(0, 0, 0));
        aaa_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        aaa_.setForeground(new java.awt.Color(255, 255, 255));
        aaa_.setText("M");
        aaa_.setMaximumSize(new java.awt.Dimension(55, 51));
        aaa_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aaa_ActionPerformed(evt);
            }
        });

        eeee_.setBackground(new java.awt.Color(0, 0, 0));
        eeee_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        eeee_.setForeground(new java.awt.Color(255, 255, 255));
        eeee_.setText("<");
        eeee_.setMaximumSize(new java.awt.Dimension(55, 51));
        eeee_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eeee_ActionPerformed(evt);
            }
        });

        uu_.setBackground(new java.awt.Color(0, 0, 0));
        uu_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        uu_.setForeground(new java.awt.Color(255, 255, 255));
        uu_.setText("c");
        uu_.setMaximumSize(new java.awt.Dimension(55, 51));
        uu_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uu_ActionPerformed(evt);
            }
        });

        aee_.setBackground(new java.awt.Color(0, 0, 0));
        aee_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        aee_.setForeground(new java.awt.Color(255, 255, 255));
        aee_.setText("v");
        aee_.setMaximumSize(new java.awt.Dimension(55, 51));
        aee_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aee_ActionPerformed(evt);
            }
        });

        uuuuu_.setBackground(new java.awt.Color(0, 0, 0));
        uuuuu_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        uuuuu_.setForeground(new java.awt.Color(255, 255, 255));
        uuuuu_.setText("C");
        uuuuu_.setMaximumSize(new java.awt.Dimension(55, 51));
        uuuuu_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uuuuu_ActionPerformed(evt);
            }
        });

        aeee_.setBackground(new java.awt.Color(0, 0, 0));
        aeee_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        aeee_.setForeground(new java.awt.Color(255, 255, 255));
        aeee_.setText("V");
        aeee_.setMaximumSize(new java.awt.Dimension(55, 51));
        aeee_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aeee_ActionPerformed(evt);
            }
        });

        oo_.setBackground(new java.awt.Color(0, 0, 0));
        oo_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        oo_.setForeground(new java.awt.Color(255, 255, 255));
        oo_.setText("x");
        oo_.setMaximumSize(new java.awt.Dimension(55, 51));
        oo_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oo_ActionPerformed(evt);
            }
        });

        ai_.setBackground(new java.awt.Color(0, 0, 0));
        ai_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        ai_.setForeground(new java.awt.Color(255, 255, 255));
        ai_.setText("I");
        ai_.setMaximumSize(new java.awt.Dimension(55, 51));
        ai_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ai_ActionPerformed(evt);
            }
        });

        aku_.setBackground(new java.awt.Color(0, 0, 0));
        aku_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        aku_.setForeground(new java.awt.Color(255, 255, 255));
        aku_.setText("/");
        aku_.setMaximumSize(new java.awt.Dimension(55, 51));
        aku_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aku_ActionPerformed(evt);
            }
        });

        ooooo_.setBackground(new java.awt.Color(0, 0, 0));
        ooooo_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
        ooooo_.setForeground(new java.awt.Color(255, 255, 255));
        ooooo_.setText("X");
        ooooo_.setMaximumSize(new java.awt.Dimension(55, 51));
        ooooo_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ooooo_ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Q");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("W");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("E");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("R");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("T");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Y");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("U");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("I");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("O");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setText("P");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 102));
        jLabel12.setText("[");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setText("]");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 102));
        jLabel14.setText("\\");

            javax.swing.GroupLayout Tab_Layout = new javax.swing.GroupLayout(Tab_);
            Tab_.setLayout(Tab_Layout);
            Tab_Layout.setHorizontalGroup(
                Tab_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Tab_Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tab_, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(a_, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(aaa_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ee_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(eeee_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(uu_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(uuuuu_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(aee_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(aeee_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ai_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(oo_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ooooo_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(avvvv_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(aku_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tab_Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(38, 38, 38)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(49, 49, 49)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(42, 42, 42)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(45, 45, 45)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(47, 47, 47)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(42, 42, 42)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(50, 50, 50)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(44, 44, 44)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(37, 37, 37))
            );
            Tab_Layout.setVerticalGroup(
                Tab_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Tab_Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(Tab_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(a_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ooooo_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(avvvv_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tab_, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                        .addComponent(aaa_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aku_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(oo_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ai_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aeee_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aee_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(uuuuu_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(uu_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eeee_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ee_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(Tab_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13)
                        .addComponent(jLabel14)))
            );

            Space_.setBackground(new java.awt.Color(255, 255, 255));

            space_.setBackground(new java.awt.Color(0, 0, 0));
            space_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            space_.setForeground(new java.awt.Color(255, 255, 255));
            space_.setText("Space");
            space_.setMaximumSize(new java.awt.Dimension(55, 51));
            space_.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    space_ActionPerformed(evt);
                }
            });

            ctrl_.setBackground(new java.awt.Color(0, 0, 0));
            ctrl_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            ctrl_.setForeground(new java.awt.Color(255, 255, 255));
            ctrl_.setText("Ctrl");
            ctrl_.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    ctrl_ActionPerformed(evt);
                }
            });

            tamil_.setBackground(new java.awt.Color(0, 0, 0));
            tamil_.setFont(new java.awt.Font("Baamini", 0, 18)); // NOI18N
            tamil_.setForeground(new java.awt.Color(255, 255, 255));
            tamil_.setText("jkpo;");
            tamil_.setMaximumSize(new java.awt.Dimension(55, 51));
            tamil_.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    tamil_ActionPerformed(evt);
                }
            });

            alt_.setBackground(new java.awt.Color(0, 0, 0));
            alt_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            alt_.setForeground(new java.awt.Color(255, 255, 255));
            alt_.setText("Alt");
            alt_.setMaximumSize(new java.awt.Dimension(55, 51));
            alt_.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    alt_ActionPerformed(evt);
                }
            });

            Left_.setBackground(new java.awt.Color(0, 0, 0));
            Left_.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
            Left_.setForeground(new java.awt.Color(255, 255, 255));
            Left_.setText("Left");
            Left_.setMaximumSize(new java.awt.Dimension(55, 51));
            Left_.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Left_ActionPerformed(evt);
                }
            });

            Down_.setBackground(new java.awt.Color(0, 0, 0));
            Down_.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
            Down_.setForeground(new java.awt.Color(255, 255, 255));
            Down_.setText("Down");
            Down_.setMaximumSize(new java.awt.Dimension(55, 51));
            Down_.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Down_ActionPerformed(evt);
                }
            });

            Right_.setBackground(new java.awt.Color(0, 0, 0));
            Right_.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
            Right_.setForeground(new java.awt.Color(255, 255, 255));
            Right_.setText("Right");
            Right_.setMaximumSize(new java.awt.Dimension(55, 51));
            Right_.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Right_ActionPerformed(evt);
                }
            });

            Up_.setBackground(new java.awt.Color(0, 0, 0));
            Up_.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
            Up_.setForeground(new java.awt.Color(255, 255, 255));
            Up_.setText("Up");
            Up_.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Up_ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout Space_Layout = new javax.swing.GroupLayout(Space_);
            Space_.setLayout(Space_Layout);
            Space_Layout.setHorizontalGroup(
                Space_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Space_Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ctrl_, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tamil_, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(alt_, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(space_, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Left_, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(Space_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Down_, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                        .addComponent(Up_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(Right_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            Space_Layout.setVerticalGroup(
                Space_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Space_Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(Space_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ctrl_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tamil_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(alt_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Right_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Left_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(space_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Space_Layout.createSequentialGroup()
                            .addComponent(Up_)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Down_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1)
                        .addComponent(caps_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Numerics, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Tab_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Shift_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Space_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Numerics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Tab_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(caps_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Shift_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Space_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents
    public String split(String e)
    {
        String s6="";
        for(int i=0;i<e.length()-1;i++)
                       s6=s6+e.charAt(i);
        return s6;
    }
    
    public  void print(String str )
    {
        String s5,s6="";
        if("BP".equals(str))
        {
            s5=Text.getText();
            Text.setText("");
            for(int i=0;i<s5.length()-1;i++)
            {
                Text.setText(Text.getText()+s5.charAt(i));
            }
        }
        else 
        {
            String e = Text.getText();
            Text.setText("");
            
           if(e.length()>0)
           {
                int i=e.length()-1;
                   if((e.charAt(i)=='f'||e.charAt(i)=='q'||e.charAt(i)=='r'||e.charAt(i)=='Q'||e.charAt(i)=='l'||e.charAt(i)=='z'||
                   e.charAt(i)=='j'||e.charAt(i)=='e'||e.charAt(i)=='g'||e.charAt(i)=='f'||e.charAt(i)=='k'||e.charAt(i)=='a'||e.charAt(i)=='u'||
                   e.charAt(i)=='y'||e.charAt(i)=='t'||e.charAt(i)=='o'||e.charAt(i)=='s'||e.charAt(i)=='w'||e.charAt(i)=='d'||e.charAt(i)=='['||
                   e.charAt(i)==']'));
            {
            if("M".equals(str))
            { 
                if ((e.charAt(i)=='f')||(e.charAt(i)=='q')||(e.charAt(i)=='r')||(e.charAt(i)=='l')||(e.charAt(i)=='Q')||
                    (e.charAt(i)=='z')||(e.charAt(i)=='j')||(e.charAt(i)=='e')|| (e.charAt(i)=='g')||(e.charAt(i)=='k')||(e.charAt(i)=='a')||(e.charAt(i)=='u')||
                        (e.charAt(i)=='y')||(e.charAt(i)=='t')||(e.charAt(i)=='o')||(e.charAt(i)=='s')||(e.charAt(i)=='w')||(e.charAt(i)=='d'))
                str= "h";
            }
            if(",".equals(str))
            {
                if ((e.charAt(i)=='f')||(e.charAt(i)=='q')||(e.charAt(i)=='r')||(e.charAt(i)=='l')||(e.charAt(i)=='Q')||
                    (e.charAt(i)=='z')||(e.charAt(i)=='j')||(e.charAt(i)=='e')|| (e.charAt(i)=='g')||(e.charAt(i)=='k')||(e.charAt(i)=='a')||(e.charAt(i)=='u')||
                        (e.charAt(i)=='y')||(e.charAt(i)=='t')||(e.charAt(i)=='o')||(e.charAt(i)=='s')||(e.charAt(i)=='w')||(e.charAt(i)=='d'))
                str = "p";
            }
            if(";".equals(str))
            {
                if ((e.charAt(i)=='f')||(e.charAt(i)=='q')||(e.charAt(i)=='r')||(e.charAt(i)=='l')||(e.charAt(i)=='Q')||
                    (e.charAt(i)=='z')||(e.charAt(i)=='j')||(e.charAt(i)=='e')|| (e.charAt(i)=='g')||(e.charAt(i)=='k')||(e.charAt(i)=='a')||(e.charAt(i)=='u')||
                        (e.charAt(i)=='y')||(e.charAt(i)=='t')||(e.charAt(i)=='o')||(e.charAt(i)=='s')||(e.charAt(i)=='w')||(e.charAt(i)=='d'))
                System.out.println("charAt(i)"+e.charAt(i));
                str=";";
               
            }
            if("<".equals(str))
            {
                if ((e.charAt(i)=='f')||(e.charAt(i)=='q')||(e.charAt(i)=='r')||(e.charAt(i)=='l')||(e.charAt(i)=='Q')||
                    (e.charAt(i)=='z')||(e.charAt(i)=='j')||(e.charAt(i)=='e')|| (e.charAt(i)=='g')||(e.charAt(i)=='k')||(e.charAt(i)=='a')||(e.charAt(i)=='u')||
                        (e.charAt(i)=='y')||(e.charAt(i)=='t')||(e.charAt(i)=='o')||(e.charAt(i)=='s')||(e.charAt(i)=='w')||(e.charAt(i)=='d'))
                { if(e.charAt(i)=='l')
                { //   for(i=0;i<e.length()-1;i++)
                    //   s6=s6+e.charAt(i);
                str="B";
                e=split(e);
                
                //str = "B";
                    }
                else
                str = "P";
            }}
            if("c".equals(str))
            {                     
                if (e.charAt(i)=='f')
                {   
                    e=split(e);
                    str = "F";
                }
                else if (e.charAt(i)=='q')
                {
                    e=split(e);
                    str = "E";
                }
                else if (e.charAt(i)=='r')
                {
                    e=split(e);
                    str = "R";
                }
                else if (e.charAt(i)=='l')
                {
                    e=split(e);
                    str = "L";
                }
                else if (e.charAt(i)=='z')
                {
                    e=split(e);
                    str = "Z";
                }
                else if (e.charAt(i)=='j')
                {
                    e=split(e);
                    str = "J";
                }
                else if (e.charAt(i)=='e')
                {
                    e=split(e);
                    str = "E";
                }
                else if (e.charAt(i)=='g')
                {
                    e=split(e);
                    str = "G";
                }
                else if (e.charAt(i)=='k')
                {
                    e=split(e);
                    str = "K";
                }
                else if (e.charAt(i)=='a')
                {
                    e=split(e);
                    str = "A";
                }
                else if (e.charAt(i)=='u')
                {
                    e=split(e);
                    str = "U";
                }
                else if (e.charAt(i)=='y')
                {
                    e=split(e);
                    str = "Y";
                }
                else if (e.charAt(i)=='t')
                {
                    e=split(e);
                    str = "T";
                }
                else if (e.charAt(i)=='o')
                {
                    e=split(e);
                    str = "O";
                }
                else if (e.charAt(i)=='s')
                {
                    e=split(e);
                    str = "S";
                }
                else if (e.charAt(i)=='w')
                {
                    e=split(e);
                    str = "W";
                }
                else if(e.charAt(i)=='d')
                {
                    e=split(e);
                    str="D";
                }
                
            }
            
            if("C".equals(str))
            {
                switch (e.charAt(i)) {
                    case 'f':
                        e=split(e);
                        str = "$";
                        break;
                    case 'q':
                        e=split(e);
                        str = "Eh";
                        break;
                    case 'r':
                        e=split(e);
                        str = "#";
                        break;
                    case 'l':
                        e=split(e);
                        str = "^";
                        break;
                    case 'z':
                        e=split(e);
                        str = "Zh";
                        break;
                    case 'j':
                        e=split(e);
                        str = "Jh";
                        break;
                    case 'e':
                        e=split(e);
                        str = "Eh";
                        break;
                    case 'g':
                        e=split(e);
                        str = "G+";
                        break;
                    case 'k':
                        e=split(e);
                        str = "%";
                        break;
                    case 'a':
                        e=split(e);
                        str = "A+";
                        break;
                    case 'u':
                        e=split(e);
                        str = "&";
                        break;
                    case 'y':
                        e=split(e);
                        str = "Yh";
                        break;
                    case 't':
                        e=split(e);
                        str = "T+";
                        break;
                // else if (e.charAt(i)=='s')
                //{
                //  e=split(e);
                //str = "S";
                //}
                    case 'o':
                        e=split(e);
                        str = "*";
                        break;
                    case 'w':
                        e=split(e);
                        str = "Wh";
                        break;
                    case 'd':
                        e=split(e);
                        str="Dh";
                        break;
                    default:
                        break;
                }        
            }
            if("v".equals(str))
            {
                switch (e.charAt(i)) {
                    case 'f':
                        e=split(e);
                        str = "nf";
                        break;
                    case 'q':
                        e=split(e);
                        str = "nq";
                        break;
                    case 'r':
                        e=split(e);
                        str = "nr";
                        break;
                    case 'Q':
                        e=split(e);
                        str = "nQ";
                        break;
                    case 'l':
                        e=split(e);
                        str = "nl";
                        break;
                    case 'z':
                        e=split(e);
                        str = "nz";
                        break;
                    case 'j':
                        e=split(e);
                        str = "nj";
                        break;
                    case 'e':
                        e=split(e);
                        str = "ne";
                        break;
                    case 'g':
                        e=split(e);
                        str = "ng";
                        break;
                    case 'k':
                        e=split(e);
                        str = "nk";
                        break;
                    case 'a':
                        e=split(e);
                        str = "na";
                        break;
                    case 'u':
                        e=split(e);
                        str = "nu";
                        break;
                    case 'y':
                        e=split(e);
                        str = "ny";
                        break;
                    case 't':
                        e=split(e);
                        str = "nt";
                        break;
                    case 'o':
                        e=split(e);
                        str = "no";
                        break;
                    case 's':
                        e=split(e);
                        str = "ns";
                        break;
                    case 'w':
                        e=split(e);
                        str = "nw";
                        break;
                    case 'd':
                        e=split(e);
                        str="nd";
                        break;
                    default:
                        break;
                }
            }
            if("V".equals(str))
            {
                switch (e.charAt(i)) {
                    case 'f':
                        e=split(e);
                        str = "Nf";
                        break;
                    case 'q':
                        e=split(e);
                        str = "Nq";
                        break;
                    case 'r':
                        e=split(e);
                        str = "Nr";
                        break;
                    case 'Q':
                        e=split(e);
                        str = "NQ";
                        break;
                    case 'l':
                        e=split(e);
                        str = "Nl";
                        break;
                    case 'z':
                        e=split(e);
                        str = "Nz";
                        break;
                    case 'j':
                        e=split(e);
                        str = "Nj";
                        break;
                    case 'e':
                        e=split(e);
                        str = "Ne";
                        break;
                    case 'g':
                        e=split(e);
                        str = "Ng";
                        break;
                    case 'k':
                        e=split(e);
                        str = "Nk";
                        break;
                    case 'a':
                        e=split(e);
                        str = "Na";
                        break;
                    case 'u':
                        e=split(e);
                        str = "Nu";
                        break;
                    case 'y':
                        e=split(e);
                        str = "Ny";
                        break;
                    case 't':
                        e=split(e);
                        str = "Nt";
                        break;
                    case 'o':
                        e=split(e);
                        str = "No";
                        break;
                    case 's':
                        e=split(e);
                        str = "Ns";
                        break;
                    case 'w':
                        e=split(e);
                        str = "Nw";
                        break;
                    case 'd':
                        e=split(e);
                        str="Nd";
                        break;
                    default:
                        break;
                }
            }
            if("I".equals(str))
            {
                switch (e.charAt(i)) {
                    case 'f':
                        e=split(e);
                        str = "if";
                        break;
                    case 'q':
                        e=split(e);
                        str = "iq";
                        break;
                    case 'r':
                        e=split(e);
                        str = "ir";
                        break;
                    case 'Q':
                        e=split(e);
                        str = "iQ";
                        break;
                    case 'l':
                        e=split(e);
                        str = "il";
                        break;
                    case 'z':
                        e=split(e);
                        str = "iz";
                        break;
                    case 'j':
                        e=split(e);
                        str = "ij";
                        break;
                    case 'e':
                        e=split(e);
                        str = "ie";
                        break;
                    case 'g':
                        e=split(e);
                        str = "ig";
                        break;
                    case 'k':
                        e=split(e);
                        str = "ik";
                        break;
                    case 'a':
                        e=split(e);
                        str = "ia";
                        break;
                    case 'u':
                        e=split(e);
                        str = "iu";
                        break;
                    case 'y':
                        e=split(e);
                        str = "iy";
                        break;
                    case 't':
                        e=split(e);
                        str = "it";
                        break;
                    case 'o':
                        e=split(e);
                        str = "io";
                        break;
                    case 's':
                        e=split(e);
                        str = "is";
                        break;
                    case 'w':
                        e=split(e);
                        str = "iw";
                        break;
                    case 'd':
                        e=split(e);
                        str="id";
                        break;
                    default:
                        break;
                }
            }
            if("x".equals(str))
            {
                switch (e.charAt(i)) {
                    case 'f':
                        e=split(e);
                        str = "nfh";
                        break;
                    case 'q':
                        e=split(e);
                        str = "nqh";
                        break;
                    case 'r':
                        e=split(e);
                        str = "nrh";
                        break;
                    case 'Q':
                        e=split(e);
                        str = "nQh";
                        break;
                    case 'l':
                        e=split(e);
                        str = "nlh";
                        break;
                    case 'z':
                        e=split(e);
                        str = "nzh";
                        break;
                    case 'j':
                        e=split(e);
                        str = "njh";
                        break;
                    case 'e':
                        e=split(e);
                        str = "neh";
                        break;
                    case 'g':
                        e=split(e);
                        str = "ngh";
                        break;
                    case 'k':
                        e=split(e);
                        str = "nkh";
                        break;
                    case 'a':
                        e=split(e);
                        str = "nah";
                        break;
                    case 'u':
                        e=split(e);
                        str = "nuh";
                        break;
                    case 'y':
                        e=split(e);
                        str = "nyh";
                        break;
                    case 't':
                        e=split(e);
                        str = "nth";
                        break;
                    case 'o':
                        e=split(e);
                        str = "noh";
                        break;
                    case 's':
                        e=split(e);
                        str = "nsh";
                        break;
                    case 'w':
                        e=split(e);
                        str = "nwh";
                        break;
                    case 'd':
                        e=split(e);
                        str="ndh";
                        break;
                    default:
                        break;
                }
            }
            if("X".equals(str))
            {
                switch (e.charAt(i)) {
                    case 'f':
                        e=split(e);
                        str = "Nfh";
                        break;
                    case 'q':
                        e=split(e);
                        str = "Nqh";
                        break;
                    case 'r':
                        e=split(e);
                        str = "Nrh";
                        break;
                    case 'Q':
                        e=split(e);
                        str = "NQh";
                        break;
                    case 'l':
                        e=split(e);
                        str = "Nlh";
                        break;
                    case 'z':
                        e=split(e);
                        str = "Nzh";
                        break;
                    case 'j':
                        e=split(e);
                        str = "Njh";
                        break;
                    case 'e':
                        e=split(e);
                        str = "Neh";
                        break;
                    case 'g':
                        e=split(e);
                        str = "Ngh";
                        break;
                    case 'k':
                        e=split(e);
                        str = "Nkh";
                        break;
                    case 'a':
                        e=split(e);
                        str = "Nah";
                        break;
                    case 'u':
                        e=split(e);
                        str = "Nuh";
                        break;
                    case 'y':
                        e=split(e);
                        str = "Nyh";
                        break;
                    case 't':
                        e=split(e);
                        str = "Nth";
                        break;
                    case 'o':
                        e=split(e);
                        str = "Noh";
                        break;
                    case 's':
                        e=split(e);
                        str = "Nsh";
                        break;
                    case 'w':
                        e=split(e);
                        str = "Nwh";
                        break;
                    case 'd':
                        e=split(e);
                        str="Ndh";
                        break;
                    default:
                        break;
                }
            }
            if("xs".equals(str))
            {
                switch (e.charAt(i)) {
                    case 'f':
                        e=split(e);
                        str = "nfs";
                        break;
                    case 'q':
                        e=split(e);
                        str = "nqs";
                        break;
                    case 'r':
                        e=split(e);
                        str = "nrs";
                        break;
                    case 'Q':
                        e=split(e);
                        str = "nQs";
                        break;
                    case 'l':
                        e=split(e);
                        str = "nls";
                        break;
                    case 'z':
                        e=split(e);
                        str = "nzs";
                        break;
                    case 'j':
                        e=split(e);
                        str = "njs";
                        break;
                    case 'e':
                        e=split(e);
                        str = "nes";
                        break;
                    case 'g':
                        e=split(e);
                        str = "ngs";
                        break;
                    case 'k':
                        e=split(e);
                        str = "nks";
                        break;
                    case 'a':
                        e=split(e);
                        str = "nas";
                        break;
                    case 'u':
                        e=split(e);
                        str = "nus";
                        break;
                    case 'y':
                        e=split(e);
                        str = "nys";
                        break;
                    case 't':
                        e=split(e);
                        str = "nts";
                        break;
                    case 'o':
                        e=split(e);
                        str = "nos";
                        break;
                    case 's':
                        e=split(e);
                        str = "nss";
                        break;
                    case 'w':
                        e=split(e);
                        str = "nws";
                        break;
                    case 'd':
                        e=split(e);
                        str="nds";
                        break;
                    default:
                        break;
                }
                
            }
            }}
            Text.setText(e+str);
        }
       
    }
    public void check4dot()
    {
        String s=Text.getText();
        String s7= s.substring(0,s.length()-1);
        Text.setText(s7+";");
    }
    public void get4dot(){
        if(Text.getText().length()>1)
            if(Text.getText().charAt((Text.getText().length())-1)==Text.getText().charAt((Text.getText().length())-2)){
        check4dot();}
    }
    private void Esc_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Esc_ActionPerformed

    }//GEN-LAST:event_Esc_ActionPerformed

    private void one_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_one_ActionPerformed
       print("1");
    }//GEN-LAST:event_one_ActionPerformed

    private void comma_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comma_ActionPerformed
        print(">");
    }//GEN-LAST:event_comma_ActionPerformed

    private void Two_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Two_ActionPerformed
        print("2");
    }//GEN-LAST:event_Two_ActionPerformed

    private void Three_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Three_ActionPerformed
        print("3");
    }//GEN-LAST:event_Three_ActionPerformed

    private void Four_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Four_ActionPerformed
        print("4");
    }//GEN-LAST:event_Four_ActionPerformed

    private void Five_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Five_ActionPerformed
        print("5");
    }//GEN-LAST:event_Five_ActionPerformed

    private void Six_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Six_ActionPerformed
        print("6");
    }//GEN-LAST:event_Six_ActionPerformed

    private void Seven_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seven_ActionPerformed
        print("7");
    }//GEN-LAST:event_Seven_ActionPerformed

    private void Eight_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eight_ActionPerformed
        print("8");
    }//GEN-LAST:event_Eight_ActionPerformed

    private void Zero_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Zero_ActionPerformed
        print("0");
    }//GEN-LAST:event_Zero_ActionPerformed

    private void dot_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dot_ActionPerformed
        print(".");
    }//GEN-LAST:event_dot_ActionPerformed

    private void NIne_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NIne_ActionPerformed
        print("9");
    }//GEN-LAST:event_NIne_ActionPerformed

    private void BackSpace_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackSpace_ActionPerformed
        print("BP");
    }//GEN-LAST:event_BackSpace_ActionPerformed

    private void va_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_va_ActionPerformed
        print("t");
        check4dot();
    }//GEN-LAST:event_va_ActionPerformed

    private void shift_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shift_ActionPerformed
       // shift=1;
    }//GEN-LAST:event_shift_ActionPerformed

    private void ra_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ra_ActionPerformed
        print("u");
        get4dot();
    }//GEN-LAST:event_ra_ActionPerformed

    private void la_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_la_ActionPerformed
        print("y");
        check4dot();
    }//GEN-LAST:event_la_ActionPerformed

    private void laa_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laa_ActionPerformed
        print("o");
        check4dot();
    }//GEN-LAST:event_laa_ActionPerformed

    private void laaa_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laaa_ActionPerformed
        print("s");
        check4dot();
    }//GEN-LAST:event_laaa_ActionPerformed

    private void naa_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naa_ActionPerformed
        print("d");
        check4dot();
    }//GEN-LAST:event_naa_ActionPerformed

    private void raa_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raa_ActionPerformed
        print("w");
        check4dot();
    }//GEN-LAST:event_raa_ActionPerformed

    private void jaa_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaa_ActionPerformed
        print("[");
        check4dot();
    }//GEN-LAST:event_jaa_ActionPerformed

    private void sa_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sa_ActionPerformed
        print("]");
        check4dot();
    }//GEN-LAST:event_sa_ActionPerformed

    private void sri_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sri_ActionPerformed
        print("=");
        check4dot();
    }//GEN-LAST:event_sri_ActionPerformed

    private void clear_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_allActionPerformed
        Text.setText("");
    }//GEN-LAST:event_clear_allActionPerformed

    private void chaa_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chaa_ActionPerformed
        print("r");
        get4dot();
    }//GEN-LAST:event_chaa_ActionPerformed

    private void Caps_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caps_ActionPerformed
//        print("f");
    }//GEN-LAST:event_Caps_ActionPerformed

    private void ka_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ka_ActionPerformed
        print("f");
        get4dot();
    }//GEN-LAST:event_ka_ActionPerformed

    private void Enter_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enter_ActionPerformed
        print("\n");
    }//GEN-LAST:event_Enter_ActionPerformed

    private void nza_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nza_ActionPerformed
        print("q");
        get4dot();
    }//GEN-LAST:event_nza_ActionPerformed

    private void nzaa_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nzaa_ActionPerformed
        print("Q");
        get4dot();
    }//GEN-LAST:event_nzaa_ActionPerformed

    private void ta_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ta_ActionPerformed
        print("l");
        get4dot();
    }//GEN-LAST:event_ta_ActionPerformed

    private void tha_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tha_ActionPerformed
        print("j");
        get4dot();
    }//GEN-LAST:event_tha_ActionPerformed

    private void naaa_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naaa_ActionPerformed
        print("z");
        get4dot();
    }//GEN-LAST:event_naaa_ActionPerformed

    private void na_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_na_ActionPerformed
        print("e");
        get4dot();
    }//GEN-LAST:event_na_ActionPerformed

    private void ma_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ma_ActionPerformed
        print("k");
        get4dot();
    }//GEN-LAST:event_ma_ActionPerformed

    private void pa_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pa_ActionPerformed
        print("g");
        get4dot();
    }//GEN-LAST:event_pa_ActionPerformed

    private void ya_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ya_ActionPerformed
        print("a");
        get4dot();
    }//GEN-LAST:event_ya_ActionPerformed

    private void ee_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ee_ActionPerformed
        print(",");
    }//GEN-LAST:event_ee_ActionPerformed

    private void tab_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab_ActionPerformed
        print("    ");
    }//GEN-LAST:event_tab_ActionPerformed

    private void a_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_ActionPerformed
        print("m");
    }//GEN-LAST:event_a_ActionPerformed

    private void avvvv_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avvvv_ActionPerformed
        print("x");
        print("s");
    }//GEN-LAST:event_avvvv_ActionPerformed

    private void aaa_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aaa_ActionPerformed
        print("M");
    }//GEN-LAST:event_aaa_ActionPerformed

    private void eeee_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eeee_ActionPerformed
        print("<");
    }//GEN-LAST:event_eeee_ActionPerformed

    private void uu_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uu_ActionPerformed
        print("c");
    }//GEN-LAST:event_uu_ActionPerformed

    private void aee_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aee_ActionPerformed
        print("v");
    }//GEN-LAST:event_aee_ActionPerformed

    private void uuuuu_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uuuuu_ActionPerformed
        print("C");
    }//GEN-LAST:event_uuuuu_ActionPerformed

    private void aeee_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aeee_ActionPerformed
        print("V");
    }//GEN-LAST:event_aeee_ActionPerformed

    private void oo_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oo_ActionPerformed
        print("x");
    }//GEN-LAST:event_oo_ActionPerformed

    private void ai_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ai_ActionPerformed
        print("I");
    }//GEN-LAST:event_ai_ActionPerformed

    private void aku_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aku_ActionPerformed
        print("/");
    }//GEN-LAST:event_aku_ActionPerformed

    private void ooooo_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ooooo_ActionPerformed
        print("X");
    }//GEN-LAST:event_ooooo_ActionPerformed

    private void space_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_space_ActionPerformed
        print(" ");
    }//GEN-LAST:event_space_ActionPerformed

    private void ctrl_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctrl_ActionPerformed
//        print("f");
    }//GEN-LAST:event_ctrl_ActionPerformed

    private void tamil_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamil_ActionPerformed

    }//GEN-LAST:event_tamil_ActionPerformed

    private void alt_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alt_ActionPerformed
//        print("f");
    }//GEN-LAST:event_alt_ActionPerformed

    private void Left_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Left_ActionPerformed
    //    print("f");
    }//GEN-LAST:event_Left_ActionPerformed

    private void Down_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Down_ActionPerformed
     //   print("f");
    }//GEN-LAST:event_Down_ActionPerformed

    private void Right_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Right_ActionPerformed
     //   print("f");
    }//GEN-LAST:event_Right_ActionPerformed

    private void TextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextKeyPressed
        System.out.println(evt.getKeyChar());
        String waa = String.valueOf(evt.getKeyChar());
        if(evt.getKeyChar()=='1')
        {
         print("1");   
        }
        if(evt.getKeyChar()=='2')
        {
         print("2");   
        }
        if(evt.getKeyChar()=='3')
        {
         print("3");   
        }
        if(evt.getKeyChar()=='4')
        {
         print("4");   
        }
        if(evt.getKeyChar()=='5')//KeyEvent.vk
        {
         print("5");   
        }
        if(evt.getKeyChar()=='6')
        {
         print("6");   
        }
        if(evt.getKeyChar()=='7')
        {
         print("7");   
        }
        if(evt.getKeyChar()=='8')
        {
         print("8");   
        }
        if(evt.getKeyChar()=='9')
        {
         print("9");   
        }
        if(evt.getKeyChar()=='0')
        {
         print("0");   
        }
        if(evt.getKeyChar()=='q')
        {
         print("m");   
        }
        if(evt.getKeyChar()=='w')
        {
         print("M");   
        }
        if(evt.getKeyChar()=='e')
        {
         print(",");   
        }
        if(evt.getKeyChar()=='r')
        {
         print("<");   
        }
        if(evt.getKeyChar()=='t')
        {
         print("c");   
        }
        if(evt.getKeyChar()=='y')
        {
         print("C");   
        }
        if(evt.getKeyChar()=='u')
        {
         print("v");   
        }
        if(evt.getKeyChar()=='i')
        {
         print("V");   
        }
        if(evt.getKeyChar()=='o')
        {
         print("I");   
        }
        if(evt.getKeyChar()=='p')
        {
         print("x");   
        }
        if(evt.getKeyChar()=='[')
        {
         print("X");   
        }
        if(evt.getKeyChar()==']')
        {
         print("xs");   
        }
        if(evt.getKeyChar()==KeyEvent.VK_BACK_SLASH)
        {
         print("/");   
        }
        if(evt.getKeyChar()=='a')
        {
         print("f");
         get4dot();
        }
        if(evt.getKeyChar()=='s')
        {
         print("q");   
         get4dot();
        }
        if(evt.getKeyChar()=='d')
        {
         print("r"); 
         get4dot();
        }
        if(evt.getKeyChar()=='f')
        {
         print("Q");   
         get4dot();
        }
        if(evt.getKeyChar()=='g')
        {
         print("l"); 
         get4dot();
        }
        if(evt.getKeyChar()=='h')
        {
         print("z"); 
         get4dot();
        }
        if(evt.getKeyChar()=='j')
        {
         print("j"); 
         get4dot();
        }
        if(evt.getKeyChar()=='k')
        {
         print("e"); 
         get4dot();
        }
        if(evt.getKeyChar()=='l')
        {
         print("g");   
         get4dot();
        }
        if(evt.getKeyChar()==';')
        {
         print("k"); 
         get4dot();
        }
        if(waa.equals("'"))
        {
         print("a"); 
         get4dot();
        }
        if(evt.getKeyChar()==KeyEvent.VK_ENTER)
        {
         print("\n");   
        }
        if(evt.getKeyChar()=='z')
        {
         print("u");
         get4dot();
        }
        if(evt.getKeyChar()=='x')
        {
         print("y"); 
         get4dot();
        }
        if(evt.getKeyChar()=='c')
        {
         print("t"); 
         get4dot();
        }
        if(evt.getKeyChar()=='v')
        {
         print("o"); 
         get4dot();
        }
        if(evt.getKeyChar()=='b')
        {
         print("s");  
         get4dot();
        }
        if(evt.getKeyChar()=='n')
        {
         print("w"); 
         get4dot();
        }
        if(evt.getKeyChar()=='m')
        {
         print("d"); 
         get4dot();
        }
        if(evt.getKeyChar()==',')
        {
         print("["); 
         get4dot();
        }
        if(evt.getKeyChar()=='.')
        {
         print("="); 
         get4dot();
        }
        if(evt.getKeyChar()=='/')
        {
         print("]"); 
         get4dot();
        }
        if(evt.getKeyChar()==KeyEvent.VK_TAB)
        {
         print("    ");   
        }
        if(evt.getKeyChar()==KeyEvent.VK_SPACE)
        {
         print(" ");   
        }
        if(evt.getKeyChar()=='-')
        {
         print(".");   
        }
        if(evt.getKeyChar()=='=')
        {
         print(">");   
        }
        if(evt.getKeyChar()==KeyEvent.VK_BACKSPACE)
        {
         print("BP");   
        }
        if(evt.getKeyChar()==KeyEvent.VK_UP)
        {
         print(";");   
        }
    }//GEN-LAST:event_TextKeyPressed

    private void Up_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Up_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Up_ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LayoutsPanels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LayoutsPanels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LayoutsPanels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LayoutsPanels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TamilKeyboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackSpace_;
    private javax.swing.JButton Caps_;
    private javax.swing.JButton Down_;
    private javax.swing.JButton Eight_;
    private javax.swing.JButton Enter_;
    private javax.swing.JButton Esc_;
    private javax.swing.JButton Five_;
    private javax.swing.JButton Four_;
    private javax.swing.JButton Left_;
    private javax.swing.JButton NIne_;
    private javax.swing.JPanel Numerics;
    private javax.swing.JButton Right_;
    private javax.swing.JButton Seven_;
    private javax.swing.JPanel Shift_;
    private javax.swing.JButton Six_;
    private javax.swing.JPanel Space_;
    private javax.swing.JPanel Tab_;
    private javax.swing.JTextArea Text;
    private javax.swing.JButton Three_;
    private javax.swing.JButton Two_;
    private javax.swing.JButton Up_;
    private javax.swing.JButton Zero_;
    private javax.swing.JButton a_;
    private javax.swing.JButton aaa_;
    private javax.swing.JButton aee_;
    private javax.swing.JButton aeee_;
    private javax.swing.JButton ai_;
    private javax.swing.JButton aku_;
    private javax.swing.JButton alt_;
    private javax.swing.JButton avvvv_;
    private javax.swing.JPanel caps_;
    private javax.swing.JButton chaa_;
    private javax.swing.JButton clear_all;
    private javax.swing.JButton comma_;
    private javax.swing.JButton ctrl_;
    private javax.swing.JButton dot_;
    private javax.swing.JButton ee_;
    private javax.swing.JButton eeee_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jaa_;
    private javax.swing.JButton ka_;
    private javax.swing.JButton la_;
    private javax.swing.JButton laa_;
    private javax.swing.JButton laaa_;
    private javax.swing.JButton ma_;
    private javax.swing.JButton na_;
    private javax.swing.JButton naa_;
    private javax.swing.JButton naaa_;
    private javax.swing.JButton nza_;
    private javax.swing.JButton nzaa_;
    private javax.swing.JButton one_;
    private javax.swing.JButton oo_;
    private javax.swing.JButton ooooo_;
    private javax.swing.JButton pa_;
    private javax.swing.JButton ra_;
    private javax.swing.JButton raa_;
    private javax.swing.JButton sa_;
    private javax.swing.JButton shift_;
    private javax.swing.JButton space_;
    private javax.swing.JButton sri_;
    private javax.swing.JButton ta_;
    private javax.swing.JButton tab_;
    private javax.swing.JButton tamil_;
    private javax.swing.JButton tha_;
    private javax.swing.JButton uu_;
    private javax.swing.JButton uuuuu_;
    private javax.swing.JButton va_;
    private javax.swing.JButton ya_;
    // End of variables declaration//GEN-END:variables
}
