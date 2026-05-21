void main (){

    int pecasporlote=0;
    int pecas=0;
    int lotes=0;


    while (true){

        pecasporlote = Integer.parseInt(IO.readln("Digite quantas peças defeituosas encontrou nesse lote: "));
        if (pecasporlote>=0){
            pecas += pecasporlote;
            lotes++;
        }
        if (pecasporlote<0){
            if (lotes==0)
                IO.println("Não use números negativos!");
            else
                break;
        }

    }

    float mediaobtida = (float) pecas/lotes;
    IO.println(pecas + " peça(s) defeituosa(s).");
    IO.println(lotes + " lote(s) analisado(s).");
    IO.println(mediaobtida + " = média obtida.");

    if (mediaobtida<=2)
        IO.println("Máquina Regulada (Excelente)");
    if (mediaobtida>2 && mediaobtida<=5)
        IO.println("Alerta: Necessita de Manutenção Preventiva");
    if (mediaobtida>5)
        IO.println("Paragem Crítica: Máquina Danificada");

}