package day3;

public class ZuoYe16 {
    public static void main(String[] args) {
        ZuoYe16A zuoYe16A = new ZuoYe16A();
        zuoYe16A.setBianhao("123456");
        zuoYe16A.setName("张三");
        zuoYe16A.setNianling(18);
        zuoYe16A.setShengao(179.23);
        zuoYe16A.setXingbie("男");
        System.out.println(zuoYe16A.getName()+"   编号为："+zuoYe16A.getBianhao()+"  年龄为："+zuoYe16A.getNianling()+"   性别为："+zuoYe16A.getXingbie()+"  身高为："+zuoYe16A.getShengao());
    }
}
