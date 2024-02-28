package view;

public class PhoneInheritance {

    public static void main(String[] args) {

        Phone phone = new Phone();
        phone.setCompany("금성");
        phone.setCall("제임스");

        System.out.println(phone.toString());
        System.out.println("----------- 휴대 전화 -----------");
        CelPhone celPhone = new CelPhone();
        celPhone.setCompany("노키아");
        celPhone.setCall("에릭");
        celPhone.setPortable(true);
        System.out.println(celPhone.toString());

        System.out.println("----------- 아이폰 -----------");
        Iphone iphone = new Iphone();
        iphone.setCompany("애플");
        iphone.setCall("마이크");
        iphone.setPortable(true);
        iphone.setData("전송하다");
        System.out.println(iphone); // 애플 아이폰으로 마이크에게 데이터를 전송하다.

        System.out.println("----------- 갤럭시 노트 -----------");
        AndroidPhone androidPhone = new AndroidPhone();
        androidPhone.setCompany("삼성");
        androidPhone.setCall("톰");
        androidPhone.setSize("10인치");
        androidPhone.setPortable(true);
        androidPhone.setData("전송하다.");
        System.out.println(androidPhone); // 삼성 10인치 갤럭시노트로 톰에게 데이터를 전송하다.
    }
}

class AndroidPhone extends CelPhone {
    private String size;
    private String data;
    public static final String BRAND = "Samsung";

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "AndroidPhone{" +
                "제조사 = '" + super.company + '\'' +
                "사이즈 = '" + size + '\'' +
                "브랜드 = '" + BRAND + '\'' +
                ", 수신자 = '" + super.call + '\'' +
                "이동성 = " + super.portable +
                ", 이동 유무 = '" + super.move + '\'' +
                ", 데이터 = '" + data + '\'' +
                '}';
    }
}

class Iphone extends CelPhone {
    private String data;
    public static final String BRAND = "iPhone";

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "iPhone{" +
                "제조사 = '" + super.company + '\'' +
                "브랜드 = '" + BRAND + '\'' +
                ", 수신자 = '" + super.call + '\'' +
                "이동성 = " + super.portable +
                ", 이동 유무 = '" + super.move + '\'' +
                ", 데이터 = '" + data + '\'' +

                '}';
    }

}

class CelPhone extends Phone {
    protected boolean portable;
    protected String move;

    public boolean isPortable() {
        return portable;
    }

    public void setPortable(boolean portable) {
        if (portable) {
            this.setMove("폰을 휴대할 수 있음.");
        } else {
            this.setMove("폰을 휴대할 수 없음.");
        }
        this.portable = portable;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;

    }

    @Override
    public String toString() {
        return "휴대폰{" +
                "제조사 = '" + super.company + '\'' +
                ", 수신자 = '" + super.call + '\'' +
                "이동성 = " + portable +
                ", 이동 유무 = '" + move + '\'' +
                '}';
    }
}

class Phone {

    protected String company, call; // 인스턴스 변수 = 멤버변수 => 힙 영역
    static final double TAX_RATE = 0.095; // 스태틱 변수 = 전역변수 => 스태틱영여

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company + "에서 제작하다.";
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call + "에게 전화를 건다.";
    }

    @Override
    public String toString() {
        return "집전화{" +
                "제조사 = '" + company + '\'' +
                ", 수신자 = '" + call + '\'' +
                '}';
    }
}
