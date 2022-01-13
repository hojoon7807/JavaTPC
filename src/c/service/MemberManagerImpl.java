package c.service;

import c.model.MemberDTO;

public class MemberManagerImpl implements MemberManager{
    @Override
    public boolean addMember(MemberDTO member) {
        return false;
    }

    @Override
    public boolean removeMember(String name, String phone) {
        return false;
    }

    @Override
    public boolean updateMember(MemberDTO member) {
        return false;
    }

    public static void main(String[] args) {
        MemberDTO member = new MemberDTO();
        MemberDTO member2 = new MemberDTO();
        member.changeNo();
        System.out.println(member.no);
        System.out.println(member2.no);
    }
}
