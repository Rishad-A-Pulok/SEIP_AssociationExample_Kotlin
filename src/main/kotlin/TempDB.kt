import models.Cast

val productionCastMap = mapOf<String, List<Cast>>(
    "Bad Robot Productions" to listOf<Cast>(
        Cast(castName = "Tom Cruise", castRole = "Hero", payment = 5000000.0),
        Cast(castName = "Alexandra Daddario", castRole = "Heroine", payment = 2000450.0),
        Cast(castName = "Norman Bates", castRole = "Villain", payment = 2520450.0),
    ),
    "Skydance Media" to listOf<Cast>(
        Cast(castName = "Tom Hanks", castRole = "Hero", payment = 5626570.0),
        Cast(castName = "Scarlett Johansson", castRole = "Heroine", payment = 1250450.0),
        Cast(castName = "Darth Vader", castRole = "Villain", payment = 673450.0),
    ),
    "Universal Pictures" to listOf<Cast>(
        Cast(castName = "Vin Diesel", castRole = "Hero", payment = 6755000.0),
        Cast(castName = "Michelle Rodriguez", castRole = "Heroine", payment = 3430450.0),
        Cast(castName = "Ramon Campos", castRole = "Villain", payment = 3520450.0),
    )
)