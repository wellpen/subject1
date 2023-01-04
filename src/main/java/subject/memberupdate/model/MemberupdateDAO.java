package subject.memberupdate.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import subject.memberupdate.model.MemberupdateVO;

public class MemberupdateDAO implements MemberupdateDAO_interface {

	private static DataSource ds = null;
	static {
		try {
			Context ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/letitgo");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	private static final String INSERT_STMT = "INSERT INTO member (member_name,member_address,member_email,member_phone_number) VALUES (?, ?, ?, ?)";
	private static final String GET_ALL_STMT = "SELECT member_serial_number,member_name,member_address,member_email,member_phone_number FROM member order by member_serial_number";
	private static final String GET_ONE_STMT = "SELECT member_serial_number,member_name,member_address,member_email,member_phone_number FROM member where member_serial_number = ?";
	private static final String DELETE = "DELETE FROM member where member_serial_number = ?";
	private static final String UPDATE = "UPDATE member set member_name=?, member_address=?, member_email=?, member_phone_number=? where member_serial_number = ?";

	@Override
	public void insert(MemberupdateVO memberupdateVO) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			con = ds.getConnection();
			pstmt = con.prepareStatement(INSERT_STMT);

			pstmt.setString(1, memberupdateVO.getName());
			pstmt.setString(2, memberupdateVO.getAddress());
			pstmt.setString(3, memberupdateVO.getEmail());
			pstmt.setString(4, memberupdateVO.getPhone());

			pstmt.executeUpdate();

		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. " + se.getMessage());
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}
	}

	@Override
	public void update(MemberupdateVO memberupdateVO) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			con = ds.getConnection();
			pstmt = con.prepareStatement(UPDATE);

			pstmt.setString(1, memberupdateVO.getName());
			pstmt.setString(2, memberupdateVO.getAddress());
			pstmt.setString(3, memberupdateVO.getEmail());
			pstmt.setString(4, memberupdateVO.getPhone());
			pstmt.setInt(5, memberupdateVO.getMemberserialnumber());

			pstmt.executeUpdate();

		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. " + se.getMessage());
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}
	}

	@Override
	public void delete(Integer memberserialnumber) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			con = ds.getConnection();
			pstmt = con.prepareStatement(DELETE);

			pstmt.setInt(1, memberserialnumber);

			pstmt.executeUpdate();

		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. " + se.getMessage());
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}
	}

	@Override
	public MemberupdateVO findByPrimaryKey(Integer memberserialnumber) {
		MemberupdateVO memberupdateVO = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			con = ds.getConnection();
			pstmt = con.prepareStatement(GET_ONE_STMT);

			pstmt.setInt(1, memberserialnumber);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				memberupdateVO = new MemberupdateVO();
				memberupdateVO.setMemberserialnumber(rs.getInt("member_serial_number"));
				memberupdateVO.setName(rs.getNString("member_name"));
				memberupdateVO.setAddress(rs.getString("member_address"));
				memberupdateVO.setEmail(rs.getString("member_email"));
				memberupdateVO.setPhone(rs.getString("member_phone_number"));
			}

		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. " + se.getMessage());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}
		return memberupdateVO;
	}

	@Override
	public List<MemberupdateVO> getAll() {
		List<MemberupdateVO> list = new ArrayList<MemberupdateVO>();
		MemberupdateVO memberupdateVO = null;

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			con = ds.getConnection();
			pstmt = con.prepareStatement(GET_ALL_STMT);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				memberupdateVO = new MemberupdateVO();
				memberupdateVO.setMemberserialnumber(rs.getInt("member_serial_number"));
				memberupdateVO.setName(rs.getNString("member_name"));
				memberupdateVO.setAddress(rs.getString("member_address"));
				memberupdateVO.setEmail(rs.getString("member_email"));
				memberupdateVO.setPhone(rs.getString("member_phone_number"));
				list.add(memberupdateVO); // Store the row in the list
			}

		} catch (SQLException se) {
			throw new RuntimeException("A database error occured. " + se.getMessage());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}
		return list;
	}
}
