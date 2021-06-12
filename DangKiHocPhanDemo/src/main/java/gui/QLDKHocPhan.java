/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.DangKiHocPhanDAO;
import dao.semesterDAO;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pojo.dangKiHocPhan;
import pojo.semester;

/**
 *
 * @author HP
 */
public class QLDKHocPhan extends javax.swing.JFrame {

    /**
     * Creates new form QLDKHocPhan
     */
    DefaultTableModel modelTab1;

    public QLDKHocPhan() {
        initComponents();
        setLocationRelativeTo(null);
        modelTab1 = (DefaultTableModel) tableTab1.getModel();

        jp1.setVisible(true);
        jp2.setVisible(false);
    }

    public void showTableTab1() {
        modelTab1.setNumRows(0);
        List<dangKiHocPhan> list = DangKiHocPhanDAO.layDanhSachDangKiHP();
        for (dangKiHocPhan t : list) {
            modelTab1.addRow(new Object[]{
                t.getName(), t.getNgayBatDau(), t.getNgayKetThuc()
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tab1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tab2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tab3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jpLogout = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jp2 = new javax.swing.JPanel();
        lableTab2 = new javax.swing.JLabel();
        lableHKHTTab2 = new javax.swing.JLabel();
        lableNgayBatDauTab2 = new javax.swing.JLabel();
        lableNgayKetThucTab2 = new javax.swing.JLabel();
        btnThemTab2 = new javax.swing.JButton();
        tfTab2 = new javax.swing.JTextField();
        cb1 = new javax.swing.JComboBox<>();
        cb2 = new javax.swing.JComboBox<>();
        cb3 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cb4 = new javax.swing.JComboBox<>();
        cb5 = new javax.swing.JComboBox<>();
        cb6 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_1Tab2 = new javax.swing.JTextField();
        lableExit1 = new javax.swing.JLabel();
        jp1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTab1 = new javax.swing.JTable();
        lableTab1 = new javax.swing.JLabel();
        lableExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý đăng kí học phần");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(159, 226, 191));

        tab1.setBackground(new java.awt.Color(253, 254, 254));
        tab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Danh sách các kì đăng kí");

        javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab1Layout.setVerticalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        tab2.setBackground(new java.awt.Color(253, 254, 254));
        tab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab2MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Tạo kì đăng kí học phần");

        javax.swing.GroupLayout tab2Layout = new javax.swing.GroupLayout(tab2);
        tab2.setLayout(tab2Layout);
        tab2Layout.setHorizontalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab2Layout.setVerticalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        tab3.setBackground(new java.awt.Color(253, 254, 254));
        tab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab3MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Quay lại");

        javax.swing.GroupLayout tab3Layout = new javax.swing.GroupLayout(tab3);
        tab3.setLayout(tab3Layout);
        tab3Layout.setHorizontalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab3Layout.setVerticalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_teacher_50px.png"))); // NOI18N

        jpLogout.setBackground(new java.awt.Color(255, 102, 102));
        jpLogout.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jpLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_shutdown_25px_1.png"))); // NOI18N
        jpLogout.setText("Đăng xuất");
        jpLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpLogoutMouseClicked(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tab2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(tab1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpLogout)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel14)
                .addGap(68, 68, 68)
                .addComponent(tab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jpLogout)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jp2.setBackground(new java.awt.Color(242, 243, 244));

        lableTab2.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lableTab2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lableTab2.setText("Tạo kì đăng kí học phần cho học kì hiện tại");

        lableHKHTTab2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lableHKHTTab2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lableHKHTTab2.setText("Học kì hiện tại");

        lableNgayBatDauTab2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lableNgayBatDauTab2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lableNgayBatDauTab2.setText("Chọn ngày bắt đầu");

        lableNgayKetThucTab2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lableNgayKetThucTab2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lableNgayKetThucTab2.setText("Chọn ngày kết thúc");

        btnThemTab2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnThemTab2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_create_25px.png"))); // NOI18N
        btnThemTab2.setText("Tạo");
        btnThemTab2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemTab2ActionPerformed(evt);
            }
        });

        tfTab2.setEditable(false);
        tfTab2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfTab2.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        cb1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026" }));

        cb2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });

        cb3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Năm");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Tháng");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Ngày");

        cb4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026" }));

        cb5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb5ActionPerformed(evt);
            }
        });

        cb6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Năm");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Tháng");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Ngày");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Ngày bắt đầu học kì hiện tại");

        tf_1Tab2.setEditable(false);
        tf_1Tab2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tf_1Tab2.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lableExit1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        lableExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_close_window_35px.png"))); // NOI18N
        lableExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lableExit1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp2Layout = new javax.swing.GroupLayout(jp2);
        jp2.setLayout(jp2Layout);
        jp2Layout.setHorizontalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp2Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(cb4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 428, Short.MAX_VALUE))
            .addGroup(jp2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp2Layout.createSequentialGroup()
                        .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lableNgayBatDauTab2)
                            .addGroup(jp2Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTab2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_1Tab2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jp2Layout.createSequentialGroup()
                        .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lableNgayKetThucTab2)
                            .addComponent(lableHKHTTab2))
                        .addGap(128, 128, 128)
                        .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(26, 26, 26)
                        .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb5, 0, 71, Short.MAX_VALUE)
                            .addComponent(cb2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89))))
            .addGroup(jp2Layout.createSequentialGroup()
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp2Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(btnThemTab2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lableTab2)
                .addGap(120, 120, 120))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lableExit1))
        );
        jp2Layout.setVerticalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp2Layout.createSequentialGroup()
                .addComponent(lableExit1)
                .addGap(14, 14, 14)
                .addComponent(lableTab2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp2Layout.createSequentialGroup()
                        .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfTab2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lableHKHTTab2))
                        .addGap(66, 66, 66))
                    .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_1Tab2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addGap(29, 29, 29)
                .addComponent(lableNgayBatDauTab2)
                .addGap(27, 27, 27)
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addComponent(lableNgayKetThucTab2)
                .addGap(18, 18, 18)
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(btnThemTab2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jp1.setBackground(new java.awt.Color(242, 243, 244));

        tableTab1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableTab1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên kì đăng kí học phần", "Ngày bắt đầu", "Ngày kết thúc"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableTab1);

        lableTab1.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lableTab1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lableTab1.setText("Danh sách các kì đăng kí học phần");

        lableExit.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        lableExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_close_window_35px.png"))); // NOI18N
        lableExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lableExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(lableTab1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lableExit))
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1Layout.createSequentialGroup()
                .addComponent(lableExit)
                .addGap(31, 31, 31)
                .addComponent(lableTab1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab1MouseClicked
        tab1.setBackground(new Color(204, 204, 255));
        tab2.setBackground(new Color(253, 254, 254));
        tab3.setBackground(new Color(253, 254, 254));

        jp1.setVisible(true);
        jp2.setVisible(false);

        showTableTab1();
    }//GEN-LAST:event_tab1MouseClicked

    private void tab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab2MouseClicked
        tab2.setBackground(new Color(204, 204, 255));
        tab1.setBackground(new Color(253, 254, 254));
        tab3.setBackground(new Color(253, 254, 254));

        jp2.setVisible(true);
        jp1.setVisible(false);

        semester s = semesterDAO.layThongTinSemesterHocKiHT();
        tfTab2.setText(s.getName() + " - " + s.getYear());
        tf_1Tab2.setText(s.getNgayBatDau());

    }//GEN-LAST:event_tab2MouseClicked

    private void tab3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab3MouseClicked
        new GiaoVuGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tab3MouseClicked

    private boolean checkNgayLonHon(String[] s1, String[] s2) {
        for (int i = 2; i >= 0; i--) {
            if ((s1[i]).compareTo(s2[i]) < 0) {
                return false;
            } else if ((s1[i]).compareTo(s2[i]) > 0) {
                return true;
            }
        }
        return true;
    }

    private void btnThemTab2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemTab2ActionPerformed
        semester s = semesterDAO.layThongTinSemesterHocKiHT();
        String[] list = s.getNgayBatDau().split("-");
        for (String string : list) {
            System.out.println(string);
        }
        if (cb3.getSelectedItem() == null || cb6.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(rootPane, "Ngày không được rỗng!");
            return;
        }
        String[] ngayBatDau = {cb3.getSelectedItem().toString(), cb2.getSelectedItem().toString(), cb1.getSelectedItem().toString()};
        String[] ngayKetThuc = {cb6.getSelectedItem().toString(), cb5.getSelectedItem().toString(), cb4.getSelectedItem().toString()};

        //System.out.println(ngayBatDau + " - " + ngayKetThuc);
        if (checkNgayLonHon(ngayBatDau, list) == true) {
            JOptionPane.showMessageDialog(rootPane, "Ngày bắt đầu đăng kí học phần phải trước ngày bắt đầu học kì!");
        } else if (checkNgayLonHon(ngayBatDau, ngayKetThuc) == true) {
            JOptionPane.showMessageDialog(rootPane, "Ngày kết thúc đăng kí học phần phải sau ngày bắt đầu đăng kí học phần!");
        } else {
            dangKiHocPhan dk = new dangKiHocPhan();
            dk.setName(s.getName() + " - " + s.getYear());
            dk.setNgayBatDau(ngayBatDau[0] + "-" + ngayBatDau[1] + "-" + ngayBatDau[2]);
            dk.setNgayKetThuc(ngayKetThuc[0] + "-" + ngayKetThuc[1] + "-" + ngayKetThuc[2]);
            dk.setId(0);
            dk.setHkHienTai(1);
            dangKiHocPhan x = DangKiHocPhanDAO.layThongTinDangKiHPHT();
            if (DangKiHocPhanDAO.addDangKiHP(dk) == true) {
                JOptionPane.showMessageDialog(rootPane, "Tạo kì đăng kí học phần thành công!");
                if (x != null) {
                       x.setHkHienTai(0);
                       DangKiHocPhanDAO.capNhatThongTinDangKiHP(x);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Tạo kì đăng kí học phần thất bại!");
            }
        }

    }//GEN-LAST:event_btnThemTab2ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        String s1 = cb2.getSelectedItem().toString();
        if (s1.equals("02")) {
            for (int i = 1; i <= 29; i++) {
                if (i > 9) {
                    cb3.addItem(Integer.toString(i));
                } else {
                    cb3.addItem("0" + Integer.toString(i));
                }
            }
        } else if (s1.equals("04") || s1.equals("06") || s1.equals("09") || s1.equals("11")) {
            for (int i = 1; i <= 30; i++) {
                if (i > 9) {
                    cb3.addItem(Integer.toString(i));
                } else {
                    cb3.addItem("0" + Integer.toString(i));
                }
            }
        } else {
            for (int i = 1; i <= 31; i++) {
                if (i > 9) {
                    cb3.addItem(Integer.toString(i));
                } else {
                    cb3.addItem("0" + Integer.toString(i));
                }
            }
        }
    }//GEN-LAST:event_cb2ActionPerformed

    private void cb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb5ActionPerformed
        String s1 = cb5.getSelectedItem().toString();
        if (s1.equals("02")) {
            for (int i = 1; i <= 29; i++) {
                if (i > 9) {
                    cb6.addItem(Integer.toString(i));
                } else {
                    cb6.addItem("0" + Integer.toString(i));
                }
            }
        } else if (s1.equals("04") || s1.equals("06") || s1.equals("09") || s1.equals("11")) {
            for (int i = 1; i <= 30; i++) {
                if (i > 9) {
                    cb6.addItem(Integer.toString(i));
                } else {
                    cb6.addItem("0" + Integer.toString(i));
                }
            }
        } else {
            for (int i = 1; i <= 31; i++) {
                if (i > 9) {
                    cb6.addItem(Integer.toString(i));
                } else {
                    cb6.addItem("0" + Integer.toString(i));
                }
            }
        }
    }//GEN-LAST:event_cb5ActionPerformed

    private void jpLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpLogoutMouseClicked
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jpLogoutMouseClicked

    private void lableExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lableExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lableExitMouseClicked

    private void lableExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lableExit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lableExit1MouseClicked

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QLDKHocPhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLDKHocPhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLDKHocPhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLDKHocPhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLDKHocPhan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThemTab2;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JComboBox<String> cb3;
    private javax.swing.JComboBox<String> cb4;
    private javax.swing.JComboBox<String> cb5;
    private javax.swing.JComboBox<String> cb6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jp1;
    private javax.swing.JPanel jp2;
    private javax.swing.JLabel jpLogout;
    private javax.swing.JLabel lableExit;
    private javax.swing.JLabel lableExit1;
    private javax.swing.JLabel lableHKHTTab2;
    private javax.swing.JLabel lableNgayBatDauTab2;
    private javax.swing.JLabel lableNgayKetThucTab2;
    private javax.swing.JLabel lableTab1;
    private javax.swing.JLabel lableTab2;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab2;
    private javax.swing.JPanel tab3;
    private javax.swing.JTable tableTab1;
    private javax.swing.JTextField tfTab2;
    private javax.swing.JTextField tf_1Tab2;
    // End of variables declaration//GEN-END:variables
}
