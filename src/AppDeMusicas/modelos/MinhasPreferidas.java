package AppDeMusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " Pode dar o play");
        } else{
            System.out.println(audio.getTitulo() + " Você vai gostar também");
        }
    }

}
