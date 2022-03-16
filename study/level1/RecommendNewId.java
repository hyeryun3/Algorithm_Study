package study.level1;

public class RecommendNewId {

	public static void main(String[] args) {
		String new_id = ".ab.....";
		solution2(new_id);
	}
	/*
	1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
	2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
	3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
	4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
	5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
	6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
	     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
	7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
	*/
	public static String solution2(String new_id) {
		//1단계
		new_id = new_id.toLowerCase();
		
		//2단계
//		boolean res = Pattern.matches("^[^0-9a-z-_.]", "");
		new_id = new_id.replaceAll("[^0-9a-z-_.]", "");
		
		//3단계
		new_id = new_id.replaceAll("[.]{2,}",".");
		
		//4단계
		new_id = new_id.replaceAll("^[.]|[.]$", "");

		//5단계
		new_id = new_id.length() == 0 ? "a" : new_id;
		
		//6단계
		new_id = new_id.length() > 15 ? new_id.substring(0,15) : new_id;
		new_id = new_id.replaceAll("[.]$", "");

		//7단계
		while(true) {
			if(new_id.length() < 3) {
				new_id = new_id + new_id.charAt(new_id.length()-1);
			}else {
				break;
			}
		}
		
		return new_id;
	}
	
	public static String solution(String new_id) {
        new_id=new_id.toLowerCase();
        
        for(int i=0; i<new_id.length(); i++) {
        	char id=new_id.charAt(i);
        	if(id=='-' || id=='_' || id=='.' || (id>=97 && id<=122) || (id>=48 && id<=57)) {
        		continue;
        	}else {
        		new_id=new_id.replace(id, ' ');
        	}
        }
        
        new_id=new_id.replace(" ", "");
        
        
        boolean flag=false;
        while(!flag) {
        	new_id=new_id.replace("..", ".");
        	
        	if(new_id.contains("..")) {
        		continue;
        	}else {
        		flag=true;
        	}
        }
        
        flag=false;
        
        while(!flag) {
        	if(new_id.startsWith(".")) {
        		new_id=new_id.substring(1);
        	}else if(new_id.endsWith(".")) {
        		new_id=new_id.substring(0, new_id.length()-1);
        	}
        	
        	if(new_id.startsWith(".")==false && new_id.endsWith(".")==false) {
        		flag=true;
        	}
        }
        
        
        
        if(new_id.length()==0) {
        	new_id="a";
        }
        
        if(new_id.length()>=16) {
        	new_id=new_id.substring(0,15);
        	if(new_id.charAt(14)=='.') {
        		new_id=new_id.substring(0,14);
        	}
        }
        
        
        if(new_id.length()<3) {
        	flag=false;
        	while(!flag) {
        		new_id=new_id+new_id.charAt(new_id.length()-1);
        		if(new_id.length()==3) {
        			flag=true;
        		}
        	}
        }
        
        System.out.println(new_id);
        return new_id;
    }
	
}
