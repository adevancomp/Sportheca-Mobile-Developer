package dio.me.calendarioseventos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import android.provider.CalendarContract.*
import kotlinx.android.synthetic.main.activity_main.*
import android.provider.CalendarContract.Events.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSetEvent = set_event
        btnSetEvent.setOnClickListener {
            val intent = Intent(Intent.ACTION_INSERT)                                                         // a intent com a intenção de inserir uma ação no calendário
                .setData(Events.CONTENT_URI)                                                                  // primeiro item do nosso calendário
                .putExtra(TITLE,"Bootcamp Everis")                                                      // adicionar items extras dentro do content criado primeiro é titulo
                .putExtra(EVENT_LOCATION,"on line")                                                     // adiciona item local com valor online no content
                .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,System.currentTimeMillis())                 // adiciona item horário de início do evento
                .putExtra(CalendarContract.EXTRA_EVENT_END_TIME,System.currentTimeMillis()+(60*60*1000))// adiciona item horário de fim com 1 h a mais do horário de início
                .putExtra(Attendees.ATTENDEE_NAME,"Geovani Lopes Sampaio")                              // adiciona o nome de um participante no meu evento
                .putExtra(Attendees.ORGANIZER,"Adevan Neves Santos")                                    // adiciona um organizador ao evento
                .putExtra(Attendees.ATTENDEE_EMAIL,"aleatorioM@gmail.com")                              // adiciona um e-mail para o evento
                .putExtra(Reminders.MINUTES,10)                                                         // adiciona um aviso 10 minutos antes de começar o evento
            // realizar o start da intent activity
            startActivity(intent)
        }
    }
}