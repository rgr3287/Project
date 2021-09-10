package ex01;

import java.sql.*;
import java.util.ArrayList;


public class MemberMgr {
	private DBConnectionMgr pool;
	
	public MemberMgr() {
		try {
			pool = DBConnectionMgr.getInstance();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// ID�� �ߺ� Ȯ��
	public boolean checkId(String id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		boolean result = false;
		
		try {
			con = pool.getConnection();
			sql = "select count(*) from tblMember "
					+ "where id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			int count = 0;
			
			if(rs.next() && rs.getInt(1) == 1) {
				result = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return result;
	}
	
	// �����ȣ �˻� (���θ�(~��, area3)�� ������ �˻�)
	// ArrayList: ����� ���θ��� ���� �ּҸ� ��ȯ
	public ArrayList<ZipcodeBean> zipcodeRead(String area3){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		ArrayList<ZipcodeBean> list = new ArrayList<>();
		
		try {
			con = pool.getConnection();
			sql = "select * from tblZipcode where area3 like ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%" + area3 + "%");
			// �˻��� �ܾ �����ϸ� �� ��ȸ
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ZipcodeBean bean = new ZipcodeBean();
				bean.setZipcode(rs.getString(1));
				bean.setArea1(rs.getString(2));
				bean.setArea2(rs.getString(3));
				bean.setArea3(rs.getString(4));
				list.add(bean);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return list;
		
	}
	// ȸ������
	public boolean insertMember(MemberBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		boolean result = false;
		
		try {
			con = pool.getConnection();
	         sql = "insert into tblMember(name,id,pwd,birthday,email,zipcode"
	               + ",address,hobby) values (?,?,?,?,?,?,?,?)";
	         pstmt = con.prepareStatement(sql);
	         pstmt.setString(1, bean.getName());
	         pstmt.setString(2, bean.getId());
	         pstmt.setString(3, bean.getPwd());
	         pstmt.setString(4, bean.getBirthday());
	         pstmt.setString(5, bean.getEmail());
	         pstmt.setString(6, bean.getZipcode());
	         pstmt.setString(7, bean.getAddress());
	         String hobby[] = bean.getHobby();
	         char hb[] = { '0', '0', '0', '0' };
	         String lists[] = { "����", "����", "����", "���" };
	         for (int i = 0; i < hobby.length; i++) {
	            for (int j = 0; j < lists.length; j++) {
	               if (hobby[i].equals(lists[j]))
	                  hb[j] = '1';
	            } // ���ͳݰ� ������ �����ϸ� hb[] = 1, 1, 0, 0, 0
	         } // --> 00000 �ƹ��͵� üũ ���ߴ� (DB ����)
	         pstmt.setString(8, new String(hb)); 
	         
	         if(pstmt.executeUpdate() == 1) {
	        	 result = true;
	         }
	         
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return result;
	}
	
	// �α��� (id, pwd�� tblMember ���̺� ������ �����Ͱ� �ִ���)
	public boolean loginMember(String id, String pwd) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		boolean result = false;
		
		try {
			con = pool.getConnection();
			sql = "select id from tblMember "
					+ "where id = ? and pwd = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs =pstmt.executeQuery();
			
			if(rs.next()) {
				result = true;
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return result;
		
	}
}
