package LAB2.LAB2p4;

    class Student {
        private String name;
        private int ScoreMidteam;
        private int ScoreFinal;

        public Student ( String Name , int Midteam , int Final ) {

            this.name = Name;
            this.ScoreMidteam = Midteam;
            this.ScoreFinal = Final;
        }
        
        public double calculateAverage (){
            
            double ScoreAvarage = ( ScoreMidteam + ScoreFinal ) / 2.0 ;
            return ScoreAvarage ;
        }

        public void displaySummary(){

            double agv = calculateAverage();
            System.out.println( " name  =  " + this.name);
            System.out.println( " Average score =  " + agv);
            
            if (agv >= 50) {
                System.out.println(" Status = Pass ");
            } else {
                System.out.println("Status = Fail ");
            }
         }
}