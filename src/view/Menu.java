/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.CategoryController;
import controller.EmployeesController;
import controller.OrderController;
import controller.OrderDetailController;
import controller.ProductController;
import controller.ShipmentController;
import entity.Category;
import entity.Employees;
import entity.OrderDetail;
import entity.Orders;
import entity.Product;
import entity.Shipment;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Categorymodel;
import model.Employeesmodel;
import model.Ordermodel;
import model.Productmodel;
import model.Shipmentmodel;

public class Menu extends javax.swing.JFrame {

    private final OrderDetailController OrderDetailController;
    public Menu() {
        initComponents();
        loadDataCategory();
        loadDataEmployee();
        loadDataProduct();
        loadDataShipment();
        loadDataOrder();
        setupTableSelectionCategory();
        setupTableSelectionEmloyee();
        setupTableSelectionProduct();
        setupTableSelectionShipment();
        setupTableSelectionOrder();
        getdataCbbDM();
        getdataCbbDMOrder();
        this.OrderDetailController = new OrderDetailController();
    }
    public void getdataCbbDM() {
    changeDmSp.removeAll(); // Clear existing items
        Categorymodel categoryModel = new Categorymodel();
        ArrayList<Category> categories = categoryModel.DSCategory();
        
        for (Category category : categories) {
            changeDmSp.addItem(String.valueOf(category.getCategoryID()));
        }
}
    public void getdataCbbDMOrder() {
    cbbCategory.removeAllItems(); // Clear existing items
    Categorymodel categoryModel = new Categorymodel();
    ArrayList<Category> categories = categoryModel.DSCategory();
    
    for (Category category : categories) {
        cbbCategory.addItem(category.getName());
    }
}
    public void populateProducts(String categoryName) {
    cbbProduct.removeAllItems(); // Clear existing items
    Productmodel productModel = new Productmodel();
    ArrayList<Product> products = productModel.DSProduct();

    for (Product product : products) {
        if (product.getCategoryID() == getCategoryIdByName(categoryName)) {
            cbbProduct.addItem(product.getName());
        }
    }
}

private int getCategoryIdByName(String categoryName) {
    Categorymodel categoryModel = new Categorymodel();
    ArrayList<Category> categories = categoryModel.DSCategory();

    for (Category category : categories) {
        if (category.getName().equals(categoryName)) {
            return category.getCategoryID();
        }
    }
    return -1; // or throw an exception if the category is not found
}
    public javax.swing.JButton getJButton4() {
    return jButton4;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        Anh_nen = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTimDm = new javax.swing.JTextField();
        btnOkDm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDm = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtIDDm = new javax.swing.JTextField();
        txtTenDm = new javax.swing.JTextField();
        txtMotaDm = new javax.swing.JTextField();
        btnThemDm = new javax.swing.JButton();
        btnSuaDm = new javax.swing.JButton();
        btnXoaDm = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTimSp = new javax.swing.JTextField();
        btnOkSp = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSp = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txtIDSp = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtTenSp = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtMotaSp = new javax.swing.JTextField();
        btnXoaSp = new javax.swing.JButton();
        btnSuaSp = new javax.swing.JButton();
        btnThemSp = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtGiaNhapSp = new javax.swing.JTextField();
        txtGiaBanSp = new javax.swing.JTextField();
        txtSoluongSp = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        changeDmSp = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtSdtNv = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        btnOkNv = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableNv = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtIDNv = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtHoNv = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtEmailNv = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtTimNv = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtTenNv = new javax.swing.JTextField();
        btnThemNv = new javax.swing.JButton();
        btnSuaNv = new javax.swing.JButton();
        btnXoaNv = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txtVitriNv = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtDcVc = new javax.swing.JTextField();
        txtOrderIDVc = new javax.swing.JTextField();
        txtShipDateVc = new javax.swing.JTextField();
        txtTenKhVc = new javax.swing.JTextField();
        txtSdtVc = new javax.swing.JTextField();
        txtDeliDateVc = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtTimVc = new javax.swing.JTextField();
        btnOkVc = new javax.swing.JButton();
        btnThemVc = new javax.swing.JButton();
        btnSuaVc = new javax.swing.JButton();
        btnXoaVc = new javax.swing.JButton();
        txtShipmentIDVc = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableVc = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableOrder = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tableOrderDetail = new javax.swing.JTable();
        btnAddSp = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        btnAddOrder = new javax.swing.JButton();
        btnEditOrder = new javax.swing.JButton();
        btnDeleteOrder = new javax.swing.JButton();
        cbbCategory = new javax.swing.JComboBox<>();
        cbbProduct = new javax.swing.JComboBox<>();
        txtQuantity = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(709, 487));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Trang Chủ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Danh Mục");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Sản Phẩm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Nhân Viên");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 153, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Vận Chuyển");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(153, 153, 255));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Đặt Hàng");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Anh_nen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background_dav.JPG"))); // NOI18N
        Anh_nen.setText("1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Anh_nen, javax.swing.GroupLayout.PREFERRED_SIZE, 929, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Anh_nen, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Trang Chủ", jPanel2);

        jLabel2.setBackground(new java.awt.Color(0, 204, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("QUẢN LÝ DANH MỤC");

        jLabel1.setText("Tìm kiếm");

        txtTimDm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimDmActionPerformed(evt);
            }
        });

        btnOkDm.setText("OK");
        btnOkDm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkDmActionPerformed(evt);
            }
        });

        tableDm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Tên danh mục", "Mô tả"
            }
        ));
        jScrollPane1.setViewportView(tableDm);

        jLabel7.setText("Chi tiết danh mục");

        jLabel8.setText("ID");

        jLabel9.setText("Tên danh mục");

        jLabel10.setText("Mô tả");

        txtIDDm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDDmActionPerformed(evt);
            }
        });

        txtTenDm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenDmActionPerformed(evt);
            }
        });

        btnThemDm.setText("Thêm");
        btnThemDm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemDmActionPerformed(evt);
            }
        });

        btnSuaDm.setText("Sửa");
        btnSuaDm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaDmActionPerformed(evt);
            }
        });

        btnXoaDm.setText("Xóa");
        btnXoaDm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaDmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtTenDm, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSuaDm, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtMotaDm, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 385, Short.MAX_VALUE)
                                .addComponent(btnXoaDm, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtIDDm, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnThemDm, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(106, 106, 106))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimDm, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOkDm, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTimDm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOkDm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtIDDm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnThemDm))
                            .addComponent(jLabel8))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenDm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(btnSuaDm))))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMotaDm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaDm)
                    .addComponent(jLabel10))
                .addGap(69, 69, 69))
        );

        jTabbedPane1.addTab("Danh Mục", jPanel3);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("QUẢN LÝ SẢN PHẨM");

        jLabel11.setText("Tìm kiếm");

        txtTimSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimSpActionPerformed(evt);
            }
        });

        btnOkSp.setText("OK");
        btnOkSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkSpActionPerformed(evt);
            }
        });

        tableSp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên sản phẩm", "Mô tả", "Giá nhập", "Giá bán", "Số lượng", "Danh mục"
            }
        ));
        jScrollPane2.setViewportView(tableSp);
        if (tableSp.getColumnModel().getColumnCount() > 0) {
            tableSp.getColumnModel().getColumn(6).setHeaderValue("Danh mục");
        }

        jLabel12.setText("Chi tiết sản phẩm");

        txtIDSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDSpActionPerformed(evt);
            }
        });

        jLabel13.setText("ID");

        jLabel14.setText("Tên sản phẩm");

        txtTenSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenSpActionPerformed(evt);
            }
        });

        jLabel15.setText("Mô tả");

        btnXoaSp.setText("Xóa");
        btnXoaSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSpActionPerformed(evt);
            }
        });

        btnSuaSp.setText("Sửa");
        btnSuaSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaSpActionPerformed(evt);
            }
        });

        btnThemSp.setText("Thêm");
        btnThemSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSpActionPerformed(evt);
            }
        });

        jLabel16.setText("Giá nhập");

        jLabel17.setText("Giá bán");

        jLabel18.setText("Số lượng");

        jLabel19.setText("Danh mục");

        txtGiaBanSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaBanSpActionPerformed(evt);
            }
        });

        txtSoluongSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoluongSpActionPerformed(evt);
            }
        });

        jLabel20.setText("VND");

        jLabel21.setText("VND");

        changeDmSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeDmSpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtIDSp, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtGiaNhapSp, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtMotaSp, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                        .addComponent(jLabel19)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(changeDmSp, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSoluongSp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtGiaBanSp, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtTenSp, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoaSp, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuaSp, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemSp, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(328, 328, 328))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTimSp, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnOkSp, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
                            .addContainerGap()))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtSoluongSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoaSp)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btnThemSp)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIDSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTenSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addGap(8, 8, 8)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(txtGiaNhapSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnSuaSp))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtGiaBanSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17)
                                .addComponent(jLabel20)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMotaSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 18, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel15)
                                    .addComponent(changeDmSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(75, 75, 75))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTimSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOkSp)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(227, 227, 227)))
        );

        jTabbedPane1.addTab("Sản Phẩm", jPanel4);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("QUẢN LÝ NHÂN VIÊN");

        txtSdtNv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSdtNvActionPerformed(evt);
            }
        });

        jLabel23.setText("Tìm kiếm");

        btnOkNv.setText("OK");
        btnOkNv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkNvActionPerformed(evt);
            }
        });

        tableNv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Họ", "Tên", "Email", "Số điện thoại", "Vị trí"
            }
        ));
        jScrollPane3.setViewportView(tableNv);

        jLabel24.setText("Chi tiết nhân viên");

        jLabel25.setText("ID");

        txtIDNv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDNvActionPerformed(evt);
            }
        });

        jLabel26.setText("Tên");

        txtHoNv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoNvActionPerformed(evt);
            }
        });

        jLabel27.setText("Họ");

        jLabel28.setText("Email");

        txtTimNv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimNvActionPerformed(evt);
            }
        });

        jLabel29.setText("Số điện thoại");

        txtTenNv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenNvActionPerformed(evt);
            }
        });

        btnThemNv.setText("Thêm");
        btnThemNv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNvActionPerformed(evt);
            }
        });

        btnSuaNv.setText("Sửa");
        btnSuaNv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaNvActionPerformed(evt);
            }
        });

        btnXoaNv.setText("Xóa");
        btnXoaNv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNvActionPerformed(evt);
            }
        });

        jLabel22.setText("Vị trí");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTimNv, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOkNv, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel24))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtIDNv, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel28))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(txtTenNv, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                                .addComponent(jLabel29))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtHoNv, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel22)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(txtEmailNv, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139)
                                .addComponent(btnThemNv, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtVitriNv, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSdtNv, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnXoaNv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSuaNv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)))
                .addGap(0, 65, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTimNv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOkNv)
                            .addComponent(jLabel23)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailNv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(btnThemNv)
                    .addComponent(txtIDNv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVitriNv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txtHoNv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(btnSuaNv))
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSdtNv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(txtTenNv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(btnXoaNv))
                .addGap(81, 81, 81))
        );

        jTabbedPane1.addTab("Nhân Viên", jPanel5);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("QUẢN LÝ VẬN CHUYỂN");

        jLabel33.setText("Thông tin vận chuyển");

        jLabel39.setText("Shipment ID");

        jLabel40.setText("Địa Chỉ");

        jLabel41.setText("Tên Khách Hàng");

        jLabel42.setText("Số Điện Thoại");

        jLabel43.setText("Ngày Vận Chuyển");

        jLabel44.setText("Ngày Giao Hàng");

        txtDcVc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDcVcActionPerformed(evt);
            }
        });

        txtOrderIDVc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrderIDVcActionPerformed(evt);
            }
        });

        txtTenKhVc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKhVcActionPerformed(evt);
            }
        });

        jLabel34.setText("Tìm Kiếm");

        btnOkVc.setText("Ok");
        btnOkVc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkVcActionPerformed(evt);
            }
        });

        btnThemVc.setText("Lưu Thông Tin Vận Chuyển");
        btnThemVc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemVcActionPerformed(evt);
            }
        });

        btnSuaVc.setText("Sửa");
        btnSuaVc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaVcActionPerformed(evt);
            }
        });

        btnXoaVc.setText("Xóa");
        btnXoaVc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaVcActionPerformed(evt);
            }
        });

        txtShipmentIDVc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtShipmentIDVcActionPerformed(evt);
            }
        });

        jLabel45.setText("OrderID");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnSuaVc)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThemVc, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnXoaVc))
                                    .addComponent(txtTenKhVc))
                                .addGap(25, 25, 25)
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtShipmentIDVc, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOrderIDVc, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDcVc, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSdtVc, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel43)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDeliDateVc, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtShipDateVc, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTimVc, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOkVc)
                        .addGap(34, 34, 34))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addGap(15, 15, 15)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40)
                    .addComponent(jLabel43)
                    .addComponent(txtOrderIDVc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtShipDateVc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDcVc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtShipmentIDVc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addGap(22, 22, 22)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jLabel41)
                    .addComponent(jLabel44)
                    .addComponent(txtTenKhVc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSdtVc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDeliDateVc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel34)
                        .addComponent(txtTimVc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOkVc)
                        .addComponent(btnThemVc))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSuaVc)
                        .addComponent(btnXoaVc)))
                .addContainerGap())
        );

        tableVc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Shipment ID", "Order ID", "Tên khách hàng", "Địa chỉ", "Số điện thoại", "Ngày vận chuyển", "Ngày giao hàng"
            }
        ));
        jScrollPane5.setViewportView(tableVc);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel6))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Doanh Thu", jPanel7);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("QUẢN LÝ ĐẶT HÀNG");

        tableOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Đơn Hàng", "Ngày", "Tổng Tiền", "Trạng Thái"
            }
        ));
        jScrollPane4.setViewportView(tableOrder);

        jLabel37.setText("Danh sách đơn hàng");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel37)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton11.setText("jButton11");

        tableOrderDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID CT Đơn Hàng", "ID Đơn Hàng", "Sản Phẩm", "Số Lượng", "Đơn Giá", "Tổng Tiền"
            }
        ));
        jScrollPane8.setViewportView(tableOrderDetail);

        btnAddSp.setText("Thêm sản phẩm");

        jLabel38.setText("Chi tiết đơn hàng");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
            .addComponent(btnAddSp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddSp)
                .addGap(210, 210, 210)
                .addComponent(jButton11)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel35.setText("Ngày");

        jLabel36.setText("Trạng thái");

        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });

        btnAddOrder.setText("Thêm");
        btnAddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrderActionPerformed(evt);
            }
        });

        btnEditOrder.setText("Sửa");
        btnEditOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditOrderActionPerformed(evt);
            }
        });

        btnDeleteOrder.setText("Xóa");
        btnDeleteOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteOrderActionPerformed(evt);
            }
        });

        cbbCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbCategoryActionPerformed(evt);
            }
        });

        cbbProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbProductActionPerformed(evt);
            }
        });

        jLabel30.setText("Số lượng");

        jLabel31.setText("Danh mục");

        jLabel32.setText("Sản Phẩm");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cbbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                        .addComponent(txtStatus, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAddOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEditOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDeleteOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(btnAddOrder)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditOrder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteOrder)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel32))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabel5))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Đặt Hàng", jPanel6);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, -40, -1, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtTimDmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimDmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimDmActionPerformed

    private void btnOkDmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkDmActionPerformed
        String keyword = txtTimDm.getText().trim();
    
    if (keyword.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a keyword to search.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    CategoryController controller = new CategoryController();
    ArrayList<Category> searchResults = controller.searchCategories(keyword);

    DefaultTableModel tableCategory = (DefaultTableModel) tableDm.getModel();
    tableCategory.setRowCount(0); // Clear existing data

    for (Category item : searchResults) {
        Object[] rowData = {
            item.getCategoryID(),
            item.getName(),
            item.getDescription(),
        };
        tableCategory.addRow(rowData);
    }
    }//GEN-LAST:event_btnOkDmActionPerformed

    private void txtIDDmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDDmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDDmActionPerformed

    private void txtTenDmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenDmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenDmActionPerformed

    private void btnSuaDmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaDmActionPerformed
        String categoryid = txtIDDm.getText();
    String name = txtTenDm.getText();
    String description = txtMotaDm.getText();

    if (categoryid.isEmpty() || name.isEmpty() || description.isEmpty() ) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int CategoryID;
    try {
        CategoryID = Integer.parseInt(categoryid);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Category category = new Category(CategoryID, name, description);

    CategoryController controller = new CategoryController();
    if (controller.Update(category)) {
        loadDataCategory();
        ResetForm();
    } else {
        JOptionPane.showMessageDialog(this, "Update failed", "Database Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnSuaDmActionPerformed

    private void txtTimSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimSpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimSpActionPerformed

    private void btnOkSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkSpActionPerformed
       String keyword = txtTimSp.getText().trim();
    
    if (keyword.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a keyword to search.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    ProductController controller = new ProductController();
    ArrayList<Product> searchResults = controller.searchProducts(keyword);

    DefaultTableModel tableProduct = (DefaultTableModel) tableSp.getModel();
    tableProduct.setRowCount(0); // Clear existing data

    for (Product item : searchResults) {
        Object[] rowData = {
            item.getProductID(),
            item.getName(),
            item.getDescription(),
            item.getPrice(),
            item.getPriceOld(),
            item.getStockQuantity(),
            item.getCategoryID(),
        };
        tableProduct.addRow(rowData);
    }
    }//GEN-LAST:event_btnOkSpActionPerformed

    private void txtIDSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDSpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDSpActionPerformed

    private void txtTenSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenSpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSpActionPerformed

    private void btnSuaSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaSpActionPerformed
        String productidStr = txtIDSp.getText();
    String name = txtTenSp.getText();
    String description = txtMotaSp.getText();
    String priceStr = txtGiaNhapSp.getText();
    String priceOldStr = txtGiaBanSp.getText();
    String stockQuantityStr = txtSoluongSp.getText();
    String categoryStr = changeDmSp.getSelectedItem().toString();

    if (productidStr.isEmpty() || name.isEmpty() || description.isEmpty() || priceStr.isEmpty() || priceOldStr.isEmpty() || stockQuantityStr.isEmpty() || categoryStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        int productID = Integer.parseInt(productidStr);
        int price = Integer.parseInt(priceStr);
        int priceOld = Integer.parseInt(priceOldStr);
        int stockQuantity = Integer.parseInt(stockQuantityStr);
        int categoryID = Integer.parseInt(categoryStr); // Assuming categoryStr is an ID that can be parsed to an int

        Product product = new Product(productID, name, description, price, priceOld, stockQuantity, categoryID);

        ProductController controller = new ProductController();
        if (controller.Update(product)) {
            loadDataProduct();
            ResetFormProduct();
        } else {
            JOptionPane.showMessageDialog(this, "Update failed", "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter valid numbers for ID, price, old price, stock quantity, and category.", "Input Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnSuaSpActionPerformed

    private void txtSoluongSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoluongSpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoluongSpActionPerformed

    private void txtGiaBanSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaBanSpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaBanSpActionPerformed

    private void txtSdtNvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSdtNvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSdtNvActionPerformed

    private void btnOkNvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkNvActionPerformed
        String keyword = txtTimNv.getText().trim();
    
    if (keyword.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a keyword to search.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    EmployeesController controller = new EmployeesController();
    ArrayList<Employees> searchResults = controller.searchEmployees(keyword);

    DefaultTableModel tableEmployee = (DefaultTableModel) tableNv.getModel();
    tableEmployee.setRowCount(0); // Clear existing data

    for (Employees item : searchResults) {
        Object[] rowData = {
            item.getEmployeeID(),
            item.getFirstName(),
            item.getLastName(),
            item.getEmail(),
            item.getPhone(),
            item.getPosition(),
        };
        tableEmployee.addRow(rowData);
    }
    }//GEN-LAST:event_btnOkNvActionPerformed

    private void txtIDNvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDNvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDNvActionPerformed

    private void txtTimNvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimNvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimNvActionPerformed

    private void txtTenNvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenNvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenNvActionPerformed

    private void btnSuaNvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaNvActionPerformed
    String employeeid = txtIDNv.getText();
    String firstname = txtHoNv.getText();
    String lastname = txtTenNv.getText();
    String email = txtEmailNv.getText();
    String phone = txtSdtNv.getText();
    String position = txtVitriNv.getText();

    if (employeeid.isEmpty() || firstname.isEmpty() || lastname.isEmpty() || email.isEmpty() || phone.isEmpty() || position.isEmpty() ) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int EmployeeID;
    try {
        EmployeeID = Integer.parseInt(employeeid);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Employees employee = new Employees(EmployeeID, firstname, lastname, email, phone, position);

    EmployeesController controller = new EmployeesController();
    if (controller.Update(employee)) {
        loadDataEmployee();
        ResetFormEmployee();
    } else {
        JOptionPane.showMessageDialog(this, "Update failed", "Database Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnSuaNvActionPerformed

    private void txtHoNvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoNvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoNvActionPerformed

    private void btnThemNvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNvActionPerformed
        String firstname = txtHoNv.getText();
        String lastname = txtTenNv.getText();
        String email = txtEmailNv.getText();
        String phone = txtSdtNv.getText();
        String position = txtVitriNv.getText();

        if (firstname.isEmpty() || lastname.isEmpty() || email.isEmpty() || phone.isEmpty() || position.isEmpty() ) {
            // Handle input validation error
            System.out.println("Please fill in all fields");
            return;
        }

        Employees Employees = new Employees(0, firstname, lastname, email, phone, position); // ID is 0 or can be omitted if your constructor allows

        EmployeesController controller = new EmployeesController();
        if (controller.Insert(Employees) > 0) {
            loadDataEmployee();
            ResetFormEmployee();
        } else {
            // Handle insertion error
            System.out.println("Insert failed");
        }
    }//GEN-LAST:event_btnThemNvActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed

    private void cbbProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbProductActionPerformed

    private void btnDeleteOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteOrderActionPerformed

    private void btnThemDmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemDmActionPerformed
        String name = txtTenDm.getText();
        String description = txtMotaDm.getText();

        if (name.isEmpty() || description.isEmpty() ) {
            // Handle input validation error
            System.out.println("Please fill in all fields");
            return;
        }

        Category Category = new Category(0, name, description); // ID is 0 or can be omitted if your constructor allows

        CategoryController controller = new CategoryController();
        if (controller.Insert(Category) > 0) {
            loadDataCategory();
            ResetForm();
        } else {
            // Handle insertion error
            System.out.println("Insert failed");
        }
    }//GEN-LAST:event_btnThemDmActionPerformed

    private void btnXoaDmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaDmActionPerformed
        // TODO add your handling code here:
        String categoryid = txtIDDm.getText();

    if (categoryid.isEmpty()) {
        // Display an error message or use a dialog to alert the user
        System.out.println("Please fill in the ID field.");
        return;
    }

    int id = Integer.parseInt(categoryid);

    CategoryController controller = new CategoryController();
    if (controller.Delete(id)) {
        loadDataCategory();
        ResetForm();
    } else {
        System.out.println("Delete failed");
    }
    }//GEN-LAST:event_btnXoaDmActionPerformed

    private void btnXoaNvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaNvActionPerformed
       String employeeid = txtIDNv.getText();

    if (employeeid.isEmpty()) {
        // Display an error message or use a dialog to alert the user
        System.out.println("Please fill in the ID field.");
        return;
    }

    int id = Integer.parseInt(employeeid);

    EmployeesController controller = new EmployeesController();
    if (controller.Delete(id)) {
        loadDataEmployee();
        ResetFormEmployee();
    } else {
        System.out.println("Delete failed");
    }
    }//GEN-LAST:event_btnXoaNvActionPerformed

    private void txtOrderIDVcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderIDVcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderIDVcActionPerformed

    private void txtTenKhVcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKhVcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKhVcActionPerformed

    private void txtDcVcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDcVcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDcVcActionPerformed

    private void btnXoaSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSpActionPerformed
       String employeeid = txtIDSp.getText();

    if (employeeid.isEmpty()) {
        // Display an error message or use a dialog to alert the user
        System.out.println("Please fill in the ID field.");
        return;
    }

    int id = Integer.parseInt(employeeid);

    ProductController controller = new ProductController();
    if (controller.Delete(id)) {
        loadDataProduct();
        ResetFormProduct();
    } else {
        System.out.println("Delete failed");
    }
    }//GEN-LAST:event_btnXoaSpActionPerformed

    private void changeDmSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeDmSpActionPerformed
        String s = changeDmSp.getSelectedItem().toString();
        System.out.println(s);
    }//GEN-LAST:event_changeDmSpActionPerformed

    private void btnThemSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSpActionPerformed
       String name = txtTenSp.getText();
    String description = txtMotaSp.getText();
    String priceStr = txtGiaNhapSp.getText();
    String priceOldStr = txtGiaBanSp.getText();
    String stockQuantityStr = txtSoluongSp.getText();
    String categoryStr = changeDmSp.getSelectedItem().toString();

    if (name.isEmpty() || description.isEmpty() || priceStr.isEmpty() || priceOldStr.isEmpty() || stockQuantityStr.isEmpty() || categoryStr.isEmpty()) {
        // Handle input validation error
        System.out.println("Please fill in all fields");
        return;
    }

    try {
        int price = Integer.parseInt(priceStr);
        int priceOld = Integer.parseInt(priceOldStr);
        int stockQuantity = Integer.parseInt(stockQuantityStr);
        int categoryID = Integer.parseInt(categoryStr); // Assuming categoryStr is an ID that can be parsed to an int

        Product product = new Product(0, name, description, price, priceOld, stockQuantity, categoryID);

        ProductController controller = new ProductController();
        if (controller.Insert(product) > 0) {
            loadDataProduct();
            ResetFormProduct();
        } else {
            // Handle insertion error
            System.out.println("Insert failed");
        }
    } catch (NumberFormatException e) {
        // Handle number format exception
        System.out.println("Please enter valid numbers for price, old price, and stock quantity");
    }
    }//GEN-LAST:event_btnThemSpActionPerformed

    private void btnThemVcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemVcActionPerformed
        String orderIDString = txtOrderIDVc.getText();
        String customerName = txtTenKhVc.getText();
        String address = txtDcVc.getText();
        String phone = txtSdtVc.getText();
        String shipDateString = txtShipDateVc.getText();
        String deliDateString = txtDeliDateVc.getText();

        if (orderIDString.isEmpty() || customerName.isEmpty() || address.isEmpty() || phone.isEmpty() || shipDateString.isEmpty() || deliDateString.isEmpty()) {
            System.out.println("Please fill in all fields");
            return;
        }

        int orderID;
        try {
            orderID = Integer.parseInt(orderIDString);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Order ID");
            return;
        }
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date shipDate;
        Date deliDate;
        try {
            shipDate = new Date(dateFormat.parse(shipDateString).getTime());
            deliDate = new Date(dateFormat.parse(deliDateString).getTime());
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd");
            return;
        }

        Shipment shipment = new Shipment(0, orderID, customerName, address, phone, shipDate, deliDate); // ID is 0 or can be omitted if your constructor allows

        ShipmentController controller = new ShipmentController();
        if (controller.Insert(shipment) > 0) {
            loadDataShipment();
            ResetFormShipment();
        } else {
            // Handle insertion error
            System.out.println("Insert failed");
        }
    }//GEN-LAST:event_btnThemVcActionPerformed

    private void btnSuaVcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaVcActionPerformed
        String shipmentIDString = txtShipmentIDVc.getText();
        String orderIDString = txtOrderIDVc.getText();
        String customerName = txtTenKhVc.getText();
        String address = txtDcVc.getText();
        String phone = txtSdtVc.getText();
        String shipDateString = txtShipDateVc.getText();
        String deliDateString = txtDeliDateVc.getText();

        if (orderIDString.isEmpty() || customerName.isEmpty() || address.isEmpty() || phone.isEmpty() || shipDateString.isEmpty() || deliDateString.isEmpty()) {
            System.out.println("Please fill in all fields");
            return;
        }
        
        int shipmentID;
        try {
            shipmentID = Integer.parseInt(shipmentIDString);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int orderID;
        try {
            orderID = Integer.parseInt(orderIDString);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Order ID");
            return;
        }
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date shipDate;
        Date deliDate;
        try {
            shipDate = new Date(dateFormat.parse(shipDateString).getTime());
            deliDate = new Date(dateFormat.parse(deliDateString).getTime());
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd");
            return;
        }

        Shipment shipment = new Shipment(shipmentID, orderID, customerName, address, phone, shipDate, deliDate); // ID is 0 or can be omitted if your constructor allows

        ShipmentController controller = new ShipmentController();
        if (controller.Update(shipment)) {
            loadDataShipment();
            ResetFormShipment();
        } else {
            JOptionPane.showMessageDialog(this, "Update failed", "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSuaVcActionPerformed

    private void btnXoaVcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaVcActionPerformed
        String shipmentid = txtShipmentIDVc.getText();

        if (shipmentid.isEmpty()) {
            // Display an error message or use a dialog to alert the user
            System.out.println("Please fill in the ID field.");
            return;
        }

        int id = Integer.parseInt(shipmentid);

        ShipmentController controller = new ShipmentController();
        if (controller.Delete(id)) {
            loadDataShipment();
            ResetFormShipment();
        } else {
            System.out.println("Delete failed");
        }
    }//GEN-LAST:event_btnXoaVcActionPerformed

    private void txtShipmentIDVcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtShipmentIDVcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtShipmentIDVcActionPerformed

    private void btnOkVcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkVcActionPerformed
        String keyword = txtTimVc.getText().trim();
    
        if (keyword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a keyword to search.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        ShipmentController controller = new ShipmentController();
        ArrayList<Shipment> searchResults = controller.searchShipment(keyword);

        DefaultTableModel tableShipment = (DefaultTableModel) tableVc.getModel();
        tableShipment.setRowCount(0); // Clear existing data

        for (Shipment item : searchResults) {
            Object[] rowData = {
                item.getShipmentID(),
                item.getOrderID(),
                item.getCustomerName(),
                item.getAddress(),
                item.getPhone(),
                item.getShippingDate(),
                item.getDeliveryDate(),
            };
            tableShipment.addRow(rowData);
        }
    }//GEN-LAST:event_btnOkVcActionPerformed

    private void btnAddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrderActionPerformed
        String OrderDateString = txtDate.getText();
        String status = txtStatus.getText();

        if (OrderDateString.isEmpty() || status.isEmpty()) {
            System.out.println("Please fill in all fields");
            return;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date orderDate;

        try {
            orderDate = new Date(dateFormat.parse(OrderDateString).getTime());
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd");
            return;
        }

        // Set TotalAmount to 0 temporarily
        float totalAmount = 0;

        Orders order = new Orders(0, orderDate, totalAmount, status);

        OrderController controller = new OrderController();
        if (controller.Insert(order) > 0) {
            loadDataOrder();
            ResetFormOrder();
        } else {
            System.out.println("Insert failed");
        }
    }//GEN-LAST:event_btnAddOrderActionPerformed

    private void cbbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbCategoryActionPerformed
       String selectedCategoryName = cbbCategory.getSelectedItem().toString();
    System.out.println(selectedCategoryName);
    populateProducts(selectedCategoryName);
    }//GEN-LAST:event_cbbCategoryActionPerformed

    private void btnEditOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditOrderActionPerformed
           // TODO add your handling code here:
           
    }//GEN-LAST:event_btnEditOrderActionPerformed
    private void loadDataCategory() {
            Categorymodel model = new Categorymodel();
            ArrayList<Category> dataList = model.DSCategory();

            DefaultTableModel tableCategory = (DefaultTableModel) tableDm.getModel();
            tableCategory.setRowCount(0); // Clear existing data

            for (Category item : dataList) {
                Object[] rowData = {
                    item.getCategoryID(),
                    item.getName(),
                    item.getDescription(),
                };
                tableCategory.addRow(rowData);
            }
        }
    private void setupTableSelectionCategory() {
         tableDm.getSelectionModel().addListSelectionListener(event -> {
             if (!event.getValueIsAdjusting() && tableDm.getSelectedRow() != -1) {
                 int selectedRow = tableDm.getSelectedRow();
                 txtIDDm.setText(tableDm.getValueAt(selectedRow, 0).toString());
                 txtTenDm.setText(tableDm.getValueAt(selectedRow, 1).toString());
                 txtMotaDm.setText(tableDm.getValueAt(selectedRow, 2).toString());
             }
         });
     }
    private void ResetForm(){
         txtIDDm.setText("");
         txtTenDm.setText("");
         txtMotaDm.setText("");
     }
    private void loadDataEmployee() {
            Employeesmodel model = new Employeesmodel();
            ArrayList<Employees> dataList = model.DSEmployees();

            DefaultTableModel tableEmployee = (DefaultTableModel) tableNv.getModel();
            tableEmployee.setRowCount(0); // Clear existing data

            for (Employees item : dataList) {
                Object[] rowData = {
                    item.getEmployeeID(),
                    item.getFirstName(),
                    item.getLastName(),
                    item.getEmail(),
                    item.getPhone(),
                    item.getPosition(),
                };
                tableEmployee.addRow(rowData);
            }
        }
    private void setupTableSelectionEmloyee() {
         tableNv.getSelectionModel().addListSelectionListener(event -> {
             if (!event.getValueIsAdjusting() && tableNv.getSelectedRow() != -1) {
                 int selectedRow = tableNv.getSelectedRow();
                 txtIDNv.setText(tableNv.getValueAt(selectedRow, 0).toString());
                 txtHoNv.setText(tableNv.getValueAt(selectedRow, 1).toString());
                 txtTenNv.setText(tableNv.getValueAt(selectedRow, 2).toString());
                 txtEmailNv.setText(tableNv.getValueAt(selectedRow, 3).toString());
                 txtSdtNv.setText(tableNv.getValueAt(selectedRow, 4).toString());
                 txtVitriNv.setText(tableNv.getValueAt(selectedRow, 5).toString());
             }
         });
     }
    private void ResetFormEmployee(){
         txtIDNv.setText("");
         txtHoNv.setText("");
         txtTenNv.setText("");
         txtEmailNv.setText("");
         txtSdtNv.setText("");
         txtVitriNv.setText("");
     }
    private void loadDataProduct() {
            Productmodel model = new Productmodel();
            ArrayList<Product> dataList = model.DSProduct();

            DefaultTableModel tableProduct = (DefaultTableModel) tableSp.getModel();
            tableProduct.setRowCount(0); // Clear existing data

            for (Product item : dataList) {
                Object[] rowData = {
                    item.getProductID(),
                    item.getName(),
                    item.getDescription(),
                    item.getPrice(),
                    item.getPriceOld(),
                    item.getStockQuantity(),
                    item.getCategoryID(),
                };
                tableProduct.addRow(rowData);
            }
        }
    private void setupTableSelectionProduct() {
         tableSp.getSelectionModel().addListSelectionListener(event -> {
             if (!event.getValueIsAdjusting() && tableSp.getSelectedRow() != -1) {
                 int selectedRow = tableSp.getSelectedRow();
                 txtIDSp.setText(tableSp.getValueAt(selectedRow, 0).toString());
                 txtTenSp.setText(tableSp.getValueAt(selectedRow, 1).toString());
                 txtMotaSp.setText(tableSp.getValueAt(selectedRow, 2).toString());
                 txtGiaNhapSp.setText(tableSp.getValueAt(selectedRow, 3).toString());
                 txtGiaBanSp.setText(tableSp.getValueAt(selectedRow, 4).toString());
                 txtSoluongSp.setText(tableSp.getValueAt(selectedRow, 5).toString());
                 int i = 0;
                    while (true) {
                    String nameFromeCbbox = changeDmSp.getItemAt(i).toString();
                    if (nameFromeCbbox.equalsIgnoreCase(tableSp.getValueAt(selectedRow, 6).toString())) {
                        changeDmSp.setSelectedIndex(i);
                        break;
                    }
                    i++;
        }
//                 changeDmSp.set(tableSp.getValueAt(selectedRow, 6).toString());
             }
         });
     }
    private void ResetFormProduct(){
         txtIDSp.setText("");
         txtTenSp.setText("");
         txtMotaSp.setText("");
         txtGiaNhapSp.setText("");
         txtGiaBanSp.setText("");
         txtSoluongSp.setText("");
         
     }
    
    private void loadDataShipment() {
            Shipmentmodel model = new Shipmentmodel();
            ArrayList<Shipment> dataList = model.DSShipment();

            DefaultTableModel tableShipment = (DefaultTableModel) tableVc.getModel();
            tableShipment.setRowCount(0); // Clear existing data

            for (Shipment item : dataList) {
                Object[] rowData = {
                    item.getShipmentID(),
                    item.getOrderID(),
                    item.getCustomerName(),
                    item.getAddress(),
                    item.getPhone(),
                    item.getShippingDate(),
                    item.getDeliveryDate(),
                };
                tableShipment.addRow(rowData);
            }
        }
    private void setupTableSelectionShipment() {
         tableVc.getSelectionModel().addListSelectionListener(event -> {
             if (!event.getValueIsAdjusting() && tableVc.getSelectedRow() != -1) {
                 int selectedRow = tableVc.getSelectedRow();
                 txtShipmentIDVc.setText(tableVc.getValueAt(selectedRow, 0).toString());
                 txtOrderIDVc.setText(tableVc.getValueAt(selectedRow, 1).toString());
                 txtTenKhVc.setText(tableVc.getValueAt(selectedRow, 2).toString());
                 txtDcVc.setText(tableVc.getValueAt(selectedRow, 3).toString());
                 txtSdtVc.setText(tableVc.getValueAt(selectedRow, 4).toString());
                 txtShipDateVc.setText(tableVc.getValueAt(selectedRow, 5).toString());
                 txtDeliDateVc.setText(tableVc.getValueAt(selectedRow, 6).toString());
             }
         });
     }
    private void ResetFormShipment(){
         txtShipmentIDVc.setText("");
         txtOrderIDVc.setText("");
         txtTenKhVc.setText("");
         txtDcVc.setText("");
         txtSdtVc.setText("");
         txtShipDateVc.setText("");
         txtDeliDateVc.setText("");
     }
    private void loadDataOrder() {
            Ordermodel model = new Ordermodel();
            ArrayList<Orders> dataList = model.DSOrders();

            DefaultTableModel tableOrder = (DefaultTableModel) this.tableOrder.getModel();
            tableOrder.setRowCount(0); // Clear existing data

            for (Orders item : dataList) {
                Object[] rowData = {
                    item.getOrderID(),
                    item.getOrderDate(),
                    item.getTotalAmount(),
                    item.getStatus(),

                };
                tableOrder.addRow(rowData);
            }
        }
    private void setupTableSelectionOrder() {
         tableOrder.getSelectionModel().addListSelectionListener(event -> {
        if (!event.getValueIsAdjusting() && tableOrder.getSelectedRow() != -1) {
            int selectedRow = tableOrder.getSelectedRow();
            txtDate.setText(tableOrder.getValueAt(selectedRow, 1).toString());
            txtStatus.setText(tableOrder.getValueAt(selectedRow, 3).toString());

            int orderId = Integer.parseInt(tableOrder.getValueAt(selectedRow, 0).toString());
            loadOrderDetails(orderId);
        }
    });
     }
    private void loadOrderDetails(int orderId) {
    DefaultTableModel model = (DefaultTableModel) tableOrderDetail.getModel();
    model.setRowCount(0); // Clear existing rows

    ArrayList<OrderDetail> orderDetails = OrderDetailController.getOrderDetailsByOrderId(orderId);

    for (OrderDetail detail : orderDetails) {
        model.addRow(new Object[]{
            detail.getOrderDetailID(),
            detail.getOrderID(),
            detail.getProductID(),
            detail.getUnitPrice(),
            detail.getTotalPrice(),
        });
    }
}
     private void ResetFormOrder(){
         txtDate.setText("");
         txtStatus.setText("");
     }
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Anh_nen;
    private javax.swing.JButton btnAddOrder;
    private javax.swing.JButton btnAddSp;
    private javax.swing.JButton btnDeleteOrder;
    private javax.swing.JButton btnEditOrder;
    private javax.swing.JButton btnOkDm;
    private javax.swing.JButton btnOkNv;
    private javax.swing.JButton btnOkSp;
    private javax.swing.JButton btnOkVc;
    private javax.swing.JButton btnSuaDm;
    private javax.swing.JButton btnSuaNv;
    private javax.swing.JButton btnSuaSp;
    private javax.swing.JButton btnSuaVc;
    private javax.swing.JButton btnThemDm;
    private javax.swing.JButton btnThemNv;
    private javax.swing.JButton btnThemSp;
    private javax.swing.JButton btnThemVc;
    private javax.swing.JButton btnXoaDm;
    private javax.swing.JButton btnXoaNv;
    private javax.swing.JButton btnXoaSp;
    private javax.swing.JButton btnXoaVc;
    private javax.swing.JComboBox<String> cbbCategory;
    private javax.swing.JComboBox<String> cbbProduct;
    private javax.swing.JComboBox<String> changeDmSp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tableDm;
    private javax.swing.JTable tableNv;
    private javax.swing.JTable tableOrder;
    private javax.swing.JTable tableOrderDetail;
    private javax.swing.JTable tableSp;
    private javax.swing.JTable tableVc;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDcVc;
    private javax.swing.JTextField txtDeliDateVc;
    private javax.swing.JTextField txtEmailNv;
    private javax.swing.JTextField txtGiaBanSp;
    private javax.swing.JTextField txtGiaNhapSp;
    private javax.swing.JTextField txtHoNv;
    private javax.swing.JTextField txtIDDm;
    private javax.swing.JTextField txtIDNv;
    private javax.swing.JTextField txtIDSp;
    private javax.swing.JTextField txtMotaDm;
    private javax.swing.JTextField txtMotaSp;
    private javax.swing.JTextField txtOrderIDVc;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSdtNv;
    private javax.swing.JTextField txtSdtVc;
    private javax.swing.JTextField txtShipDateVc;
    private javax.swing.JTextField txtShipmentIDVc;
    private javax.swing.JTextField txtSoluongSp;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTenDm;
    private javax.swing.JTextField txtTenKhVc;
    private javax.swing.JTextField txtTenNv;
    private javax.swing.JTextField txtTenSp;
    private javax.swing.JTextField txtTimDm;
    private javax.swing.JTextField txtTimNv;
    private javax.swing.JTextField txtTimSp;
    private javax.swing.JTextField txtTimVc;
    private javax.swing.JTextField txtVitriNv;
    // End of variables declaration//GEN-END:variables
}
