class Solution {
    public boolean winnerOfGame(String colors) {

        char[] character = colors.toCharArray();

        int num1 = 0, num2 = 0; 

        for(int i = 1; i < character.length-1; i++){

            if(character[i] == 'A' && character[i-1] == 'A' && character[i+1] == 'A'){
                num1++; 
            }
            else if(character[i] == 'B' && character[i-1] == 'B' && character[i+1] == 'B'){
                num2++; 
            }

        }

        return num1 > num2; 

    }
}
