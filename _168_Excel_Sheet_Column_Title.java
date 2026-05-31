   public class _168_Excel_Sheet_Column_Title {

        public String convertToTitle(int columnNumber) {
            //i called columnNumber = n
            StringBuilder sb = new StringBuilder();
            //loop while n gearter than 0
            while(columnNumber > 0) {
                //white n > 0 so need reduce n. 
                columnNumber--;
                //why I % 26 because A -> Z is 26 letters 
                //'A' internally stored as 65 
                char c = (char)('A' + columnNumber % 26);
                

                //I don't understand the last steps, I will explain it later.
                sb.append(c);
                
                columnNumber /= 26;
            }

            return sb.reverse().toString();
        }
   }
   