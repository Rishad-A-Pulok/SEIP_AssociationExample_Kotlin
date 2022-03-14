package models

import com.sun.xml.internal.ws.message.source.PayloadSourceMessage

class Movie(
    val name: String = "",
    val rating: Double = 0.0,
    val production: Production,
    val casting: List<Cast>,
) {
    override fun toString(): String {
        return "Movie(name='$name', rating=$rating, production=$production, casting=$casting)"
    }
}

class Production(val productionName: String,val producerName: String, val budget: Double){
    override fun toString(): String {
        return "Production(productionName='$productionName', producerName='$producerName', budget=$budget)"
    }
}

class Cast(val castName: String, val castRole: String, val payment: Double){
    override fun toString(): String {
        return "Cast(castName='$castName', castRole='$castRole', payment=$payment)"
    }
}
