package resolucao_de_problemas_estruturados_em_computacao.aula02;

abstract class absImpressora{

   public void Metodo(){
       System.out.println("oi");
   }
   public abstract void ImprimirPretoEBranco();
}

public interface IImpressora {

    void ImprimirPretoEBranco();
}

class Brother implements IImpressora{

    @Override
    public void ImprimirPretoEBranco() {

    }
}
