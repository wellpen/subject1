package subject.memberupdate.model;

import java.util.List;

import subject.memberupdate.model.MemberupdateVO;

public interface MemberupdateDAO_interface {
	public void insert(MemberupdateVO memberupdateVO);

	public void update(MemberupdateVO memberupdateVO);

	public void delete(Integer memberserialnumber);

	public MemberupdateVO findByPrimaryKey(Integer memberserialnumber);

	public List<MemberupdateVO> getAll();
}
