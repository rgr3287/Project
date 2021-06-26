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
        lbl = new Label("다음 (클릭) ▶▶▶",1);
        lbl.setBackground(Color.pink);
        lbl.setBounds(200, 400, 130, 20);
        add(lbl);
        lbl.addMouseListener(this);
    }
    //paint() 메소드 구현 
    public void paint(Graphics g){
    	 g.drawString("2. 고객 정보 보기 설명서", 10, 50);
         g.drawString(" (Customer Information View)", 20, 70);
         g.drawString("2-1 전체 보기 (Full List view)", 20, 110);
         g.drawString("- 고객 정보를 인터넷 사용 시간 기준 정렬, (동일한 시간이 있을 경우 ID 정렬하였음)", 30, 130);
         g.drawString("2-2 카테고리별 보기 (Categori List view)", 20, 170);
         g.drawString("- 인터넷 사용 시간을 설정자의 입력한 시간(divi)에 맞게 ", 30, 190);
         g.drawString("defaul 그룹, likely 그룹, ideal 그룹으로 나누어 보기", 50, 210);
         g.drawString("2-3 아이템별 보기", 20, 250);
         g.drawString("ID, 나이, 성별, 지역 기준으로 정렬하는 기능입니다 ", 30, 270);
         g.drawString("(지역에서 원하는 지역을 선택하면 해당 지역만 보여줍니다)", 30, 290);
         g.drawString("- 저장된 정보가 없을 경우 고객 정보가 제공되지 않을 수 있습니다", 30, 310);

    }    
    // 윈도우 종료 클래스
    public class MyWinExit extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0); // 윈도 종료
        }
    }
    @Override  //마우스 이벤트  인터페이스 구현 
    public void mouseClicked(MouseEvent e) {
        new FirstManual();   //여기가 프레임 전환 역할   
this.setVisible(false);   
    }
    @Override    //마우스 이벤트  인터페이스 구현 
    public void mousePressed(MouseEvent e) {/*구현생략*/}
    @Override  //마우스 이벤트  인터페이스 구현 
    public void mouseReleased(MouseEvent e) {/*구현생략*/}
    @Override  //마우스 이벤트  인터페이스 구현 
    public void mouseEntered(MouseEvent e) {/*구현생략*/}    
    @Override  //마우스 이벤트  인터페이스 구현 
    public void mouseExited(MouseEvent e) {/*구현생략*/}
    
}
