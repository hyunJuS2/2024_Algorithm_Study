import java.util.HashMap;
import java.util.Map;

public class PhoneNumbers{
    public static void main(String[] args) {
        Solution_phone sol = new Solution_phone();
        String[] phoneBook = {"119", "97674223", "1195524421"};
        System.out.println(sol.solution(phoneBook)); // 출력: "leo"
    }
}

class Solution_phone {
    public boolean solution(String[] phoneBook) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < phoneBook.length; i++)
            map.put(phoneBook[i], i);

        for (int i = 0; i < phoneBook.length; i++)
            for (int j = 0; j < phoneBook[i].length(); j++)
                if (map.containsKey(phoneBook[i].substring(0, j)))
                    return false;
        return true;

    }
}
