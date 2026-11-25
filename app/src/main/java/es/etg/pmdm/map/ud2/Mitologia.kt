package es.etg.pmdm.map.ud2

object Mitologia {
    val mitos = mutableListOf(
        Mito(1,"La santa campaña","Galicia,España","Floclore y tradicíon oral","Inspirada en hechos reales",true),
        Mito(2,"El minotauro de Creta","Cnosos,Crecia","Mitología antigua","Ficción/Mitologia",true),
        Mito(id=3,"La chica de la curva","Carreteras de España","Leyenda urabana","sin explicación/Documentacion",false)

    )
    private var lastId = mitos.size;
    fun add(name: String,place:String, tipology:String,truthfulness:String, investigated: Boolean){
        lastId++
        mitos.add(Mito(lastId,name,place,tipology,truthfulness,investigated))
    }
    fun search(id:Int): Mito?=mitos.find{
        it.id==id
    }
    fun delete(id:Int){
        mitos.removeAll(){it.id ==id}

    }
    fun deleteAll(){
        mitos.clear()
    }
}