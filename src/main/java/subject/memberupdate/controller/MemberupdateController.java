package subject.memberupdate.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import subject.memberupdate.model.MemberupdateService;
import subject.memberupdate.model.MemberupdateVO;

@WebServlet("/member.do")
public class MemberupdateController extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		String action = req.getParameter("action");

		if ("getOne_For_Display".equals(action)) { 

			List<String> errorMsgs = new LinkedList<String>();
			
			
			req.setAttribute("errorMsgs", errorMsgs);

		
			String str = req.getParameter("memberserialnumber");
			if (str == null || (str.trim()).length() == 0) {
				errorMsgs.add("請輸入會員編號");
			}
			
			if (!errorMsgs.isEmpty()) {
				RequestDispatcher failureView = req.getRequestDispatcher("/select_page.jsp");
				failureView.forward(req, res);
				return;
			}

			Integer memberserialnumber = null;
			try {
				memberserialnumber = Integer.valueOf(str);
			} catch (Exception e) {
				errorMsgs.add("會員編號格式不正確");
			}
		
			if (!errorMsgs.isEmpty()) {
				RequestDispatcher failureView = req.getRequestDispatcher("/select_page.jsp");
				failureView.forward(req, res);
				return;
			}

			
			MemberupdateService memberupdateService = new MemberupdateService();
			MemberupdateVO memberupdateVO = memberupdateService.getOneMember(memberserialnumber);
			if (memberupdateVO == null) {
				errorMsgs.add("查無資料");
			}
			
			if (!errorMsgs.isEmpty()) {
				RequestDispatcher failureView = req.getRequestDispatcher("/select_page.jsp");
				failureView.forward(req, res);
				return;
			}

			
			req.setAttribute("memberupdateVO", memberupdateVO); 
			String url = "/listOneMember.jsp";
			RequestDispatcher successView = req.getRequestDispatcher(url); 
			successView.forward(req, res);
		}

		if ("getOne_For_Update".equals(action)) {

			List<String> errorMsgs = new LinkedList<String>();
			
			
			req.setAttribute("errorMsgs", errorMsgs);

			
			Integer memberserialnumber = Integer.valueOf(req.getParameter("memberserialnumber"));

			
			MemberupdateService memberupdateService = new MemberupdateService();
			MemberupdateVO memberupdateVO = memberupdateService.getOneMember(memberserialnumber);

			
			req.setAttribute("memberupdateVO", memberupdateVO); 
			String url = "/update_member_input.jsp";
			RequestDispatcher successView = req.getRequestDispatcher(url);
			successView.forward(req, res);
		}

		if ("update".equals(action)) { 

			List<String> errorMsgs = new LinkedList<String>();
			
			
			req.setAttribute("errorMsgs", errorMsgs);

			
			Integer memberserialnumber = Integer.valueOf(req.getParameter("memberserialnumber").trim());

			String name = req.getParameter("name");
			String enameReg = "^[(\u4e00-\u9fa5)(a-zA-Z)]{2,10}$";
			if (name == null || name.trim().length() == 0) {
				errorMsgs.add("會員姓名: 請勿空白");
			} else if (!name.trim().matches(enameReg)) { 
				errorMsgs.add("會員姓名: 只能是中、英文字母, 且長度必需在2到10之間");
			}

			String address = req.getParameter("address").trim();
			if (address == null || address.trim().length() == 0) {
				errorMsgs.add("地址請勿空白");
			}	

			String email = req.getParameter("email").trim();
			if (email == null || email.trim().length() == 0) {
				errorMsgs.add("電子信箱請勿空白");
			}

			String phone = req.getParameter("phone");
			String phoneReg = "^[(0-9)]{10}$";
			if (phone == null || phone.trim().length() == 0) {
				errorMsgs.add("會員電話: 請勿空白");
			} else if (!phone.trim().matches(phoneReg)) { 
				errorMsgs.add("會員電話: 只能數字, 且長度需10碼");
			}

			MemberupdateVO memberupdateVO = new MemberupdateVO();
			memberupdateVO.setMemberserialnumber(memberserialnumber);
			memberupdateVO.setName(name);
			memberupdateVO.setAddress(address);
			memberupdateVO.setEmail(email);
			memberupdateVO.setPhone(phone);

			
			if (!errorMsgs.isEmpty()) {
				req.setAttribute("memberupdateVO", memberupdateVO); 
				RequestDispatcher failureView = req.getRequestDispatcher("/update_member_input.jsp");
				failureView.forward(req, res);
				return; 
			}
			
			
			MemberupdateService memberupdateService = new MemberupdateService();
			memberupdateVO = memberupdateService.updateMember(memberserialnumber, name, address, email, phone);


			req.setAttribute("memberupdateVO", memberupdateVO);
			String url = "/listOneMember.jsp";
			RequestDispatcher successView = req.getRequestDispatcher(url); 
			successView.forward(req, res);
		}

		if ("insert".equals(action)) { 

			List<String> errorMsgs = new LinkedList<String>();
			
			
			req.setAttribute("errorMsgs", errorMsgs);

		
			String name = req.getParameter("name");
			String enameReg = "^[(\u4e00-\u9fa5)(a-zA-Z)]{2,10}$";
			if (name == null || name.trim().length() == 0) {
				errorMsgs.add("會員姓名: 請勿空白");
			} else if (!name.trim().matches(enameReg)) { 
				errorMsgs.add("會員姓名: 只能是中、英文字母, 且長度必需在2到10之間");
			}

			String address = req.getParameter("address").trim();
			if (address == null || address.trim().length() == 0) {
				errorMsgs.add("地址請勿空白");
			}

			String email = req.getParameter("email").trim();
			if (email == null || email.trim().length() == 0) {
				errorMsgs.add("電子信箱請勿空白");
			}

			String phone = req.getParameter("phone");
			String phoneReg = "^[(0-9)]{10}$";
			if (phone == null || phone.trim().length() == 0) {
				errorMsgs.add("會員電話: 請勿空白");
			} else if (!phone.trim().matches(phoneReg)) { 
				errorMsgs.add("會員電話: 只能數字, 且長度需10碼");
			}

			MemberupdateVO memberupdateVO = new MemberupdateVO();
			memberupdateVO.setName(name);
			memberupdateVO.setAddress(address);
			memberupdateVO.setEmail(email);
			memberupdateVO.setPhone(phone);

			
			if (!errorMsgs.isEmpty()) {
				req.setAttribute("memberupdateVO", memberupdateVO); 
				RequestDispatcher failureView = req.getRequestDispatcher("/addMember.jsp");				
				failureView.forward(req, res);
				return;
			}
			

			
			MemberupdateService memberupdateService = new MemberupdateService();
			memberupdateVO = memberupdateService.addMember(name, address, email, phone);

			
			String url = "/listAllMember.jsp";
			RequestDispatcher successView = req.getRequestDispatcher(url); 
			successView.forward(req, res);
		}

		if ("delete".equals(action)) { 

			List<String> errorMsgs = new LinkedList<String>();
			
			
			req.setAttribute("errorMsgs", errorMsgs);

		
			Integer memberserialnumber = Integer.valueOf(req.getParameter("memberserialnumber"));

			
			MemberupdateService memberupdateService = new MemberupdateService();
			memberupdateService.deleteMember(memberserialnumber);

			
			String url = "/listAllMember.jsp";
			RequestDispatcher successView = req.getRequestDispatcher(url);
			successView.forward(req, res);
		}
	}
}
