/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TelaBiblioteca;

import ClasseBancoDados.DataBaseBiblioteca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Texugo Estudioso
 */
public class TelaCadastroLeitor extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroLeitor
     */
    public TelaCadastroLeitor() {
        initComponents();
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNomeLeitor = new javax.swing.JTextField();
        txtDataNascimento = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        TxtCep = new javax.swing.JTextField();
        TxtEndereco = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnEprestimo = new javax.swing.JButton();
        btnConsutar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabelaLeitor = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CADASTRO DE LEITORES");

        jLabel2.setText("Nome completo:");

        jLabel3.setText("Data de Nascimento:");

        jLabel4.setText("CPF:");

        jLabel5.setText("Celular:");

        jLabel6.setText("Cep:");

        jLabel7.setText("Endereco:");

        jLabel8.setText("Numero:");

        jLabel9.setText("Complemento:");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnEprestimo.setText("Emprestimo");
        btnEprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEprestimoActionPerformed(evt);
            }
        });

        btnConsutar.setText("Consultar");
        btnConsutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsutarActionPerformed(evt);
            }
        });

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        jTabelaLeitor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOME", "DATA DE NASCIMENTO", "CPF"
            }
        ));
        jScrollPane2.setViewportView(jTabelaLeitor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEprestimo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeLeitor))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3)
                                .addGap(6, 6, 6)
                                .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5)
                                .addGap(6, 6, 6)
                                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel6)
                                .addGap(6, 6, 6)
                                .addComponent(TxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel7)
                                .addGap(6, 6, 6)
                                .addComponent(TxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel8)
                                .addGap(6, 6, 6)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnCadastrar)
                                .addGap(33, 33, 33)
                                .addComponent(btnConsutar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Editar)
                                .addGap(49, 49, 49)
                                .addComponent(btnRemover)))
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addComponent(txtNomeLeitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5))
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCadastrar)
                        .addComponent(btnConsutar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRemover)
                        .addComponent(Editar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnEprestimo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
    String nome = txtNomeLeitor.getText();
    String dataNasc = txtDataNascimento.getText();
    String cpf = txtCpf.getText();
    String celular = txtCelular.getText();
    String cep = TxtCep.getText();
    String endereco = TxtEndereco.getText();
    String numero = txtNumero.getText();
    String complemento = txtComplemento.getText();

    if (nome.isEmpty() || dataNasc.isEmpty() || cpf.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios.");
        return;
    }

    java.sql.Date sqlDate;
    try {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date utilDate = sdf.parse(dataNasc);
        sqlDate = new java.sql.Date(utilDate.getTime());
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(this, "Formato de data inválido. Use o formato DD/MM/YYYY.");
        return;
    }

    try (Connection conn = DataBaseBiblioteca.getConnection()) {
        String sql = "INSERT INTO leitores (nome, dataNasc, cpf, tel, cep, endereco, numero, complemento) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setDate(2, sqlDate);
            stmt.setString(3, cpf);
            stmt.setString(4, celular);
            stmt.setString(5, cep);
            stmt.setString(6, endereco);
            stmt.setString(7, numero);
            stmt.setString(8, complemento);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Leitor cadastrado com sucesso!");

            // Atualiza a tabela de leitores após o cadastro
            btnConsutarActionPerformed(evt);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Erro ao cadastrar leitor: " + e.getMessage());
    }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnConsutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsutarActionPerformed
    String nomeConsulta = txtNomeLeitor.getText().trim();
    String cpfConsulta = txtCpf.getText().trim();
    
    // Verifica se pelo menos um dos campos está preenchido
    if (nomeConsulta.isEmpty() && cpfConsulta.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, digite o CPF ou o Nome para consultar.");
        return;
    }

    String sql = "SELECT * FROM leitores WHERE (nome LIKE ? OR ? = '') AND (cpf = ? OR ? = '')";
    try (Connection conn = DataBaseBiblioteca.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, "%" + nomeConsulta + "%"); // Busca por nome
        stmt.setString(2, nomeConsulta); // Para garantir que não haja filtro se o nome estiver vazio
        stmt.setString(3, cpfConsulta); // Busca por CPF
        stmt.setString(4, cpfConsulta); // Para garantir que não haja filtro se o CPF estiver vazio

        try (ResultSet rs = stmt.executeQuery()) {
            DefaultTableModel model = (DefaultTableModel) jTabelaLeitor.getModel();
            model.setRowCount(0); // Limpa a tabela antes de adicionar novos dados

            if (rs.next()) {
                // Cria uma StringBuilder para armazenar os detalhes do leitor
                StringBuilder detalhes = new StringBuilder();
                detalhes.append("Nome: ").append(rs.getString("nome")).append("\n");
                detalhes.append("Data de Nascimento: ").append(rs.getDate("dataNasc")).append("\n");
                detalhes.append("CPF: ").append(rs.getString("cpf")).append("\n");
                detalhes.append("Celular: ").append(rs.getString("tel")).append("\n");
                detalhes.append("CEP: ").append(rs.getString("cep")).append("\n");
                detalhes.append("Endereço: ").append(rs.getString("endereco")).append("\n");
                detalhes.append("Número: ").append(rs.getString("numero")).append("\n");
                detalhes.append("Complemento: ").append(rs.getString("complemento")).append("\n");

                // Exibe os detalhes em um JOptionPane
                JOptionPane.showMessageDialog(this, detalhes.toString(), "Detalhes do Leitor", JOptionPane.INFORMATION_MESSAGE);

                // Adiciona o leitor encontrado à tabela
                model.addRow(new Object[]{
                    rs.getString("nome"),
                    rs.getDate("dataNasc"),
                    rs.getString("cpf"),
                    rs.getString("tel"),
                    rs.getString("cep"),
                    rs.getString("endereco"),
                    rs.getString("numero"),
                    rs.getString("complemento")
                });
            } else {
                JOptionPane.showMessageDialog(this, "Leitor não encontrado.");
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Erro ao consultar leitores: " + e.getMessage());
    }
    }//GEN-LAST:event_btnConsutarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
  int selectedRow = jTabelaLeitor.getSelectedRow();
    
    if (selectedRow != -1) {
        // Obtemos o CPF da linha selecionada na tabela
        String cpf = (String) jTabelaLeitor.getValueAt(selectedRow, 2); // Assumindo que o CPF está na terceira coluna

        // Obtemos os dados dos campos de texto
        String nome = txtNomeLeitor.getText();
        String dataNasc = txtDataNascimento.getText();
        String celular = txtCelular.getText();
        String cep = TxtCep.getText();
        String endereco = TxtEndereco.getText();
        String numero = txtNumero.getText();
        String complemento = txtComplemento.getText();

        // Verifique se os campos estão preenchidos
        if (nome.isEmpty() || dataNasc.isEmpty() || cpf.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios.");
            return;
        }

        // Verifica se a data está no formato correto
        java.sql.Date sqlDate;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date utilDate = sdf.parse(dataNasc);
            sqlDate = new java.sql.Date(utilDate.getTime());
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Formato de data inválido. Use o formato DD/MM/YYYY.");
            return;
        }

        try (Connection conn = DataBaseBiblioteca.getConnection()) {
            String sql = "UPDATE leitores SET nome = ?, dataNasc = ?, tel = ?, cep = ?, endereco = ?, numero = ?, complemento = ? WHERE cpf = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, nome);
                stmt.setDate(2, sqlDate);
                stmt.setString(3, celular);
                stmt.setString(4, cep);
                stmt.setString(5, endereco);
                stmt.setString(6, numero);
                stmt.setString(7, complemento);
                stmt.setString(8, cpf);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Leitor editado com sucesso!");
                
                // Atualiza a tabela após a edição
                btnConsutarActionPerformed(evt);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao editar leitor: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Selecione um leitor para editar.");
    }
    }//GEN-LAST:event_EditarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        int selectedRow = jTabelaLeitor.getSelectedRow();
    if (selectedRow != -1) {
        String cpf = (String) jTabelaLeitor.getValueAt(selectedRow, 2); // Assumindo que o CPF está na terceira coluna

        try (Connection conn = DataBaseBiblioteca.getConnection()) {
            String sql = "DELETE FROM leitores WHERE cpf = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, cpf);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Leitor removido com sucesso!");
                btnConsutarActionPerformed(evt); // Atualiza a tabela após a remoção
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao remover leitor: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Selecione um leitor para remover.");
    }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnEprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEprestimoActionPerformed
        dispose(); // Fecha a tela atual
        TelaEmprestimo telaEmprestimo = new TelaEmprestimo();
        telaEmprestimo.setVisible(true); // Abre a nova tela
    }//GEN-LAST:event_btnEprestimoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose(); // Fecha a tela atual
        TelaMenu telaMenu = new TelaMenu();
        telaMenu.setVisible(true); // Abre a nova tela
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroLeitor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Editar;
    private javax.swing.JTextField TxtCep;
    private javax.swing.JTextField TxtEndereco;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnConsutar;
    private javax.swing.JButton btnEprestimo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabelaLeitor;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtNomeLeitor;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
