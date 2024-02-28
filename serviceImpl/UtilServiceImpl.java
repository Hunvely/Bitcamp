package serviceImpl;

import service.UtilService;

public class UtilServiceImpl implements UtilService {

    //싱글톤 패턴
    private static UtilService instance = new UtilServiceImpl();

    private UtilServiceImpl() {
    }

    public static UtilService getInstance() {
        return instance;
    }

    @Override
    public String createRandomCompany() {
        String[] companies = {"구글", "엔비디아", "메타", "삼성", "LG", "애플"};
        return companies[createRandomInterger(0, 5)];
    }

    @Override
    public String createRandomName() {
        String[] names = {"이삭", "마동석", "송강호", "윤여정", "황정민", "정우성", "이병헌", "현 빈", "유해진", "손석구", "전도연", "손예진", "하지원", "김하늘", "송중기", "하정우", "장동건", "원 빈", "박해일", "소지섭", "김혜수"};
        return names[createRandomInterger(0, 20)];
    }

    @Override
    public String createRandomUsername() {
        String username = "";
        for (; username.length() < 5; username += String.valueOf((char) ('a' + this.createRandomInterger(0, 26)))) ;
        return username;
    }

    @Override
    public String createRandomTitle() {
        String[] titles = {"'국회의원과 정부' ", "'소관사무에 관하여 법률' ", "'신체장애자 및 질병 노령 기타의 사유로 생활능력이 없는 국민' ", "'국가의 보호' ", "'국무총리 또는 국무위원의 해임을 대통령에게 건의' ", "'헌법개정은 국회재적의원 과반수 또는 대통령의 발의로 제안' ", "'헌법재판소는 법관의 자격을 가진 9인의 재판관으로 구성' ", "'국가원로로 구성되는 국가원로자문회의' ", "'탄핵의 소추를 의결' ", "'군사법원' "};

        return titles[createRandomInterger(0, 10)];
    }

    @Override
    public String createRandomContent() {
        String[] str = {"국회의원과 정부는 법률안을 제출할 수 있다. ", "국무총리 또는 행정각부의 장은 소관사무에 관하여 법률이나 대통령령의 위임 또는 직권으로 총리령 또는 부령을 발할 수 있다. ", "신체장애자 및 질병 노령 기타의 사유로 생활능력이 없는 국민은, ", "법률이 정하는 바에 의하여 국가의 보호를 받는다. ", "국회는 국무총리 또는 국무위원의 해임을 대통령에게 건의할 수 있다. ",
                "헌법개정은 국회재적의원 과반수 또는 대통령의 발의로 제안된다. ", "헌법재판소는 법관의 자격을 가진 9인의 재판관으로 구성하며, ", "재판관은 대통령이 임명한다. ", "모든 국민은 사생활의 비밀과 자유를 침해받지 아니한다. ", "국정의 중요한 사항에 관한 대통령의 자문에 응하기 위하여, ", "국가원로로 구성되는 국가원로자문회의를 둘 수 있다. ", "대통령·국무총리·국무위원·행정각부의 장·헌법재판소 재판관·법관·중앙선거관리위원회 위원·감사원장·감사위원 기타 법률이 정한 공무원이, ", "그 직무집행에 있어서 헌법이나 법률을 위배한 때에는 국회는 탄핵의 소추를 의결할 수 있다. ", "모든 국민은 소급입법에 의하여 참정권의 제한을 받거나 재산권을 박탈당하지 아니한다. ", "군사재판을 관할하기 위하여 특별법원으로서 군사법원을 둘 수 있다. ", "대통령은 법률이 정하는 바에 의하여 사면·감형 또는 복권을 명할 수 있다. "};
        return str[createRandomInterger(0, 10)];
    }

    @Override
    public int createRandomInterger(int start, int gapBetweenStartAndEnd) {
        return start + (int) (Math.random() * gapBetweenStartAndEnd);
    }

    @Override
    public double createRandomDouble(int start, int gapBetweenStartAndEnd) {
        return Math.round(((start + Math.random() * gapBetweenStartAndEnd) * 10) / 10.0);
    }

    @Override
    public double createHeight() {
        return Math.floor(((150 + Math.random() * 50) * 10) / 10);
    }

    @Override
    public double createWeight() {
        return Math.round((30 + Math.random() * 70) * 10 / 10.0);
    }

}
