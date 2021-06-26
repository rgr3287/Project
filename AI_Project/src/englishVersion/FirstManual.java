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
		lbl = new Label("다음 (클릭) ▶▶▶", 1);
		lbl.setBackground(Color.pink);
		lbl.setBounds(200, 400, 130, 20);
		add(lbl);
		lbl.addMouseListener(this);
	}

	// paint() 메소드 구현
	public void paint(Graphics g) {
		g.drawString("1. 고객 관리 프로그램 설명서", 10, 50);
		g.drawString(" (Customer Information Management)", 20, 70);
		g.drawString("1-1 고객 정보 입력하기 (Insertion)", 20, 110);
		g.drawString("▷ 입력할 고객 수 넣기 (고객 데이터 베이스 추후 업데이트 예정)", 30, 130);
		g.drawString("▷ 아이디 : 특수 기호를 제외한 아이디를 입력하시오", 30, 150);
		g.drawString("▷ 나이 : 13세 이하, 100세 이상은 보호자의 동의가 필요합니다", 30, 170);
		g.drawString("▷ 성별 : f / m 단축 입력 가능합니다", 30, 190);
		g.drawString("▷ 지역 표기 방법 : gyeonggi_do / gyeonggido (단축표기 gg)", 30, 210);
		g.drawString("▷ 지역 : gangwon_do(gw) / gyeongsang_do(gs) ", 30, 230);
		g.drawString("	  chungchung_do(cc) / jeju_do(jj) / jeolla_do(jj)", 70, 250);
		g.drawString("▷ 인터넷 사용 시간 : 목차 정렬 기본 기준이 됩니다.", 30, 270);
		g.drawString("", 30, 290);
		g.drawString("1-2 고객 정보 삭제하기 (Deletion)", 20, 310);
		g.drawString(" 목록에서 번호를 선택하여 고객 정보를 삭제합니다", 30, 330);
		g.drawString(" 고객 정보가 삭제 될 경우 복구가 불가합니다", 30, 350);
		g.drawString("< 다중 삭제 기능, 휴지통 기능등 업데이트 예정 >", 30, 370);
	}

	// 윈도우 종료 클래스
	public class MyWinExit extends WindowAdapter {
		public void windowClosing(WindowEvent we) {
			System.exit(0); // 윈도 종료
		}
	}

	@Override // 마우스 이벤트 인터페이스 구현
	public void mouseClicked(MouseEvent e) {
		new SecondManual(); // 여기가 프레임 전환 역할
		this.setVisible(false);
	}

	@Override // 마우스 이벤트 인터페이스 구현
	public void mousePressed(MouseEvent e) {
		/* 구현생략 */}

	@Override // 마우스 이벤트 인터페이스 구현
	public void mouseReleased(MouseEvent e) {
		/* 구현생략 */}

	@Override // 마우스 이벤트 인터페이스 구현
	public void mouseEntered(MouseEvent e) {
		/* 구현생략 */}

	@Override // 마우스 이벤트 인터페이스 구현
	public void mouseExited(MouseEvent e) {
		/* 구현생략 */}

}
