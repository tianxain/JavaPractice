package student;
class NoThisSoundException extends Exception{
	/*
	 * 
	 */
	private static final long serialVersionUID = -8104368718230106578L;
	public  NoThisSoundException() {
		super();
	}
	public  NoThisSoundException(String string) {
		super(string);
	}
}
class Player{
	public void play(int index) throws  NoThisSoundException {
		if(index>10) {
			throw new NoThisSoundException("�����ŵĸ��������ڣ�");
		}
		else System.out.print("���ڲ��ţ�");
		
	}
}
public class exercise4_6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player=new Player();
    try {
           player.play(11);
        }catch(NoThisSoundException e) {
    	   System.out.println(e.getMessage());
    }
	}

}
