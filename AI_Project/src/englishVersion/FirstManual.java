package englishVersion;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FirstManual extends Frame implements MouseListener {

	Label lbl;

	FirstManual() {
		super("Menual");
		this.setVisible(true);
		this.setBounds(700, 400, 500, 500);
		this.setLayout(null);
		this.addWindowListener(new MyWinExit());
		lbl = new Label("���� (Ŭ��) ������", 1);
		lbl.setBackground(Color.pink);
		lbl.setBounds(200, 400, 130, 20);
		add(lbl);
		lbl.addMouseListener(this);
	}

	// paint() �޼ҵ� ����
	public void paint(Graphics g) {
		g.drawString("1. �� ���� ���α׷� ����", 10, 50);
		g.drawString(" (Customer Information Management)", 20, 70);
		g.drawString("1-1 �� ���� �Է��ϱ� (Insertion)", 20, 110);
		g.drawString("�� �Է��� �� �� �ֱ� (�� ������ ���̽� ���� ������Ʈ ����)", 30, 130);
		g.drawString("�� ���̵� : Ư�� ��ȣ�� ������ ���̵� �Է��Ͻÿ�", 30, 150);
		g.drawString("�� ���� : 13�� ����, 100�� �̻��� ��ȣ���� ���ǰ� �ʿ��մϴ�", 30, 170);
		g.drawString("�� ���� : f / m ���� �Է� �����մϴ�", 30, 190);
		g.drawString("�� ���� ǥ�� ��� : gyeonggi_do / gyeonggido (����ǥ�� gg)", 30, 210);
		g.drawString("�� ���� : gangwon_do(gw) / gyeongsang_do(gs) ", 30, 230);
		g.drawString("	  chungchung_do(cc) / jeju_do(jj) / jeolla_do(jj)", 70, 250);
		g.drawString("�� ���ͳ� ��� �ð� : ���� ���� �⺻ ������ �˴ϴ�.", 30, 270);
		g.drawString("", 30, 290);
		g.drawString("1-2 �� ���� �����ϱ� (Deletion)", 20, 310);
		g.drawString(" ��Ͽ��� ��ȣ�� �����Ͽ� �� ������ �����մϴ�", 30, 330);
		g.drawString(" �� ������ ���� �� ��� ������ �Ұ��մϴ�", 30, 350);
		g.drawString("< ���� ���� ���, ������ ��ɵ� ������Ʈ ���� >", 30, 370);
	}

	// ������ ���� Ŭ����
	public class MyWinExit extends WindowAdapter {
		public void windowClosing(WindowEvent we) {
			System.exit(0); // ���� ����
		}
	}

	@Override // ���콺 �̺�Ʈ �������̽� ����
	public void mouseClicked(MouseEvent e) {
		new SecondManual(); // ���Ⱑ ������ ��ȯ ����
		this.setVisible(false);
	}

	@Override // ���콺 �̺�Ʈ �������̽� ����
	public void mousePressed(MouseEvent e) {
		/* �������� */}

	@Override // ���콺 �̺�Ʈ �������̽� ����
	public void mouseReleased(MouseEvent e) {
		/* �������� */}

	@Override // ���콺 �̺�Ʈ �������̽� ����
	public void mouseEntered(MouseEvent e) {
		/* �������� */}

	@Override // ���콺 �̺�Ʈ �������̽� ����
	public void mouseExited(MouseEvent e) {
		/* �������� */}

}
