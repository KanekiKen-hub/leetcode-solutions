Time complexity is o(n) and space complexty is 0(n)


class Solution {
    public int secondHighest(String s) {
          ArrayList<Integer> list = new ArrayList<>();

        for(char c : s.toCharArray()) {

            if(Character.isDigit(c)) {
                list.add(c - '0');
            }
        }

        if(list.size()==0){
            return -1;
        }
        int largest=list.get(0);
        int second_largest=Integer.MIN_VALUE;

            for(int i =1;i<list.size();i++){
                if (list.get(i)== largest || list.get(i) == second_largest){
                    continue;
                }

                else if(list.get(i)>largest){
                    second_largest=largest;
                    largest=list.get(i);
                }

                else if(list.get(i)>second_largest){
                    second_largest=list.get(i);
                }
                }

    if(second_largest==Integer.MIN_VALUE){
        return -1;
    }
               else{
                return second_largest;

               } 

    }
}
