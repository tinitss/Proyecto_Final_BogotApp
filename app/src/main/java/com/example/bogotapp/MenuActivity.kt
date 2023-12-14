package com.example.bogotapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bogotapp.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recycler.adapter = SitiosAdapter(
            listOf(
                Sitio("Plaza de Bolívar", "plazabolivar", "La Plaza de Bolívar, corazón histórico de Bogotá, late con la esencia de Colombia. Testigo de innumerables eventos, este espacio emblemático ofrece un encuentro armonioso entre la Catedral Primada, el Capitolio Nacional y el Palacio Liévano. Su atmósfera bulliciosa es un reflejo de la vida cotidiana y las celebraciones que han marcado la historia de la nación."),
                Sitio("Museo del Oro", "museo_oro", "En el Jardín Botánico de Bogotá, la naturaleza revela su magia. Este oasis verde, hogar de una variada colección de flora, invita a explorar senderos que despiertan los sentidos. Desde orquídeas exquisitas hasta árboles imponentes, cada rincón es una lección de la biodiversidad colombiana, un remanso de paz donde la ciudad y la naturaleza se funden."),
                Sitio("Jardín  Botánico", "jardinb", "El Museo del Oro resplandece como un tesoro cultural. Sus salas albergan piezas que narran la historia precolombina a través del brillo del oro. Desde las impresionantes piezas de orfebrería hasta las intrigantes máscaras, cada objeto es un testimonio del arte y la cosmovisión de las antiguas civilizaciones que poblaron estas tierras."),
                Sitio("Museo Nacional", "museo_nal", "En el Museo Nacional de Bogotá, los pasillos se convierten en cronistas silenciosos de la historia colombiana. Artefactos, pinturas y esculturas revelan el pasado diverso y complejo del país. Desde los inicios hasta la época contemporánea, este museo es un viaje en el tiempo, donde cada pieza cuenta una historia única y valiosa." ),
            )
        )
    }
}