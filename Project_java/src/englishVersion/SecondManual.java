package englishVersion;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SecondManual extends Frame implements MouseListener {

	private static final long serialVersionUID = 1L;
    Label lbl;
    SecondManual() {
        super("Menual");
        this.setVisible(true);
        this.setBounds(700, 400, 500, 500);
        this.setLayout(null);
        this.addWindowListener(new MyWinExit());
        lbl = new Label("���� (Ŭ��) ������",1);
        lbl.setBackground(Color.pink);
        lbl.setBounds(200, 400, 130, 20);
        add(lbl);
        lbl.addMouseListener(this);
    }
    //paint() �޼ҵ� ���� 
    public void paint(Graphics g){
    	 g.drawString("2. �� ���� ���� ����", 10, 50);
         g.drawString(" (Customer Information View)", 20, 70);
         g.drawString("2-1 ��ü ���� (Full List view)", 20, 110);
         g.drawString("- �� ������ ���ͳ� ��� �ð� ���� ����, (������ �ð��� ���� ��� ID �����Ͽ���)", 30, 130);
         g.drawString("2-2 ī�װ��� ���� (Categori List view)", 20, 170);
         g.drawString("- ���ͳ� ��� �ð��� �������� �Է��� �ð�(divi)�� �°� ", 30, 190);
         g.drawString("defaul �׷�, likely �׷�, ideal �׷����� ������ ����", 50, 210);
         g.drawString("2-3 �����ۺ� ����", 20, 250);
         g.drawString("ID, ����, ����, ���� �������� �����ϴ� ����Դϴ� ", 30, 270);
         g.drawString("(�������� ���ϴ� ������ �����ϸ� �ش� ������ �����ݴϴ�)", 30, 290);
         g.drawString("- ����� ������ ���� ��� �� ������ �������� ���� �� �ֽ��ϴ�", 30, 310);

    }    
    // ������ ���� Ŭ����
    public class MyWinExit extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0); // ���� ����
        }
    }
    @Override  //���콺 �̺�Ʈ  �������̽� ���� 
    public void mouseClicked(MouseEvent e) {
        new FirstManual();   //���Ⱑ ������ ��ȯ ����   
this.setVisible(false);   
    }
    @Override    //���콺 �̺�Ʈ  �������̽� ���� 
    public void mousePressed(MouseEvent e) {/*��������*/}
    @Override  //���콺 �̺�Ʈ  �������̽� ���� 
    public void mouseReleased(MouseEvent e) {/*��������*/}
    @Override  //���콺 �̺�Ʈ  �������̽� ���� 
    public void mouseEntered(MouseEvent e) {/*��������*/}    
    @Override  //���콺 �̺�Ʈ  �������̽� ���� 
    public void mouseExited(MouseEvent e) {/*��������*/}
    
}
