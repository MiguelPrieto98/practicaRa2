package es.etg.pmdm.map.ud2

data class Mito(
    val id : Int,
    val nombre:String,
    val ubicacion: String,
    val tipologia:String,
    val veracidad:String,
    val investigado: Boolean
)
