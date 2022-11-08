package study.level0;

public class s0_120956 {
    public static void main(String[] args) {
        String[] babbling1 = {"aya","yee","u","maa","wyeoo"};
        String[] babbling2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

        System.out.println(solution(babbling2));
    }

    public static int solution(String[] babbling) {
        int answer = 0;

        String[] words = {"aya","ye","woo","ma"};

        for(int i=0; i< babbling.length; i++){
            for(int j=0; j<words.length; j++){
                if(babbling[i].contains(words[j])){
                    babbling[i] = babbling[i].replace(words[j]," ");
                    if(babbling[i].trim().equals("")){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
