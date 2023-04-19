package de.telran.averchenko.elena.homework17New.httpAnswers;

public enum HttpCodes {

    //Переопределение action либо/либо
    INFORMATIONAL(100, 199, new Action() {
        @Override
        public void action(int code, HttpCodes d) {
            System.out.println("http code" + code + ": " + INFORMATIONAL);
        }
    }),
    SUCCESS(200, 299, (code,SUCCESS) -> System.out.println("http code " + code + ": " + SUCCESS)),
    REDIRECTION(300, 399, (code,REDIRECTION) -> System.out.println("http code " + code + ": " + REDIRECTION)),
    CLIENTERROR(400, 499, (code,CLIENTERROR) -> System.out.println("http code " + code + ": " + CLIENTERROR)),
    SERVERERROR(500, 599, (code,SERVERERROR) -> System.out.println("http code " + code + ": " + SERVERERROR));

    int startVal;
    int endVal;

    Action action;

    HttpCodes(int startVal, int endVal, Action action) {
        this.startVal = startVal;
        this.endVal = endVal;
        this.action = action;
    }

    public int getStartVal() {
        return startVal;
    }

    public void setStartVal(int startVal) {
        this.startVal = startVal;
    }

    public int getEndVal() {
        return endVal;
    }

    public void setEndVal(int endVal) {
        this.endVal = endVal;
    }

    public static void findValueByCode(int code) {
        //Реализация "в лоб" - тут параметры не обязательны для определения и конструктора энама

//          if (code >= 100 && code<=199){
//              HttpCodes.INFORMATIONAL.action.action(code,INFORMATIONAL);
//          } else if (code >= 200 && code<=299){
//               HttpCodes.SUCCESS.action.action(code,SUCCESS);
//          }else if (code >= 300 && code<=399){
//               HttpCodes.REDIRECTION.action.action(code,REDIRECTION);
//          }else if (code >= 400 && code<=499){
//               HttpCodes.CLIENTERROR.action.action(code,CLIENTERROR);
//          }else if (code >= 500 && code<=599){
//               HttpCodes.SERVERERROR.action.action(code,SERVERERROR);
//                }

        //Реализация через параметры энама
        HttpCodes[] values = HttpCodes.values();
        for (HttpCodes val:values) {
            if (code >= val.startVal && code<= val.endVal){
                val.action.action(code,val);
            }
        }


    }

}
