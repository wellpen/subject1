package subject.memberupdate.model;

import java.util.List;

public class MemberupdateService {

	private MemberupdateDAO_interface dao;

	public MemberupdateService() {
		dao = new MemberupdateDAO();
	}

	public MemberupdateVO addMember(String name, String address, String email, String phone) {

		MemberupdateVO memberupdateVO = new MemberupdateVO();

		memberupdateVO.setName(name);
		memberupdateVO.setAddress(address);
		memberupdateVO.setEmail(email);
		memberupdateVO.setPhone(phone);
		dao.insert(memberupdateVO);

		return memberupdateVO;
	}

	public MemberupdateVO updateMember(Integer memberserialnumber, String name, String address, String email,
			String phone) {

		MemberupdateVO memberupdateVO = new MemberupdateVO();

		memberupdateVO.setMemberserialnumber(memberserialnumber);
		memberupdateVO.setName(name);
		memberupdateVO.setAddress(address);
		memberupdateVO.setEmail(email);
		memberupdateVO.setPhone(phone);
		dao.update(memberupdateVO);

		return memberupdateVO;
	}

	public void deleteMember(Integer memberserialnumber) {
		dao.delete(memberserialnumber);
	}

	public MemberupdateVO getOneMember(Integer memberserialnumber) {
		return dao.findByPrimaryKey(memberserialnumber);
	}

	public List<MemberupdateVO> getAll() {
		return dao.getAll();
	}
}
