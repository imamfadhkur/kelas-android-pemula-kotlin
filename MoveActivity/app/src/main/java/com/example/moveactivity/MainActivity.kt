package com.example.moveactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMove: Button = findViewById(R.id.btn_move_activity)
        btnMove.setOnClickListener(this)
        val btnMoveWithData: Button = findViewById(R.id.btn_move_with_data)
        btnMoveWithData.setOnClickListener(this)
        val btnDialNumber: Button = findViewById(R.id.btn_dial_number)
        btnDialNumber.setOnClickListener(this)
        val toViewsGroup: Button = findViewById(R.id.to_views_and_view_group)
        toViewsGroup.setOnClickListener(this)
        val toRecycler: Button = findViewById(R.id.to_recycler)
        toRecycler.setOnClickListener(this)
    }

    override fun onClick(v: View?){
        when(v?.id){
            R.id.btn_move_activity->{
                val move = Intent(this@MainActivity, moveActivity::class.java)
                startActivity(move)
            }
            R.id.btn_move_with_data->{
                val moveWithDataIntent = Intent(this@MainActivity, activityWithData::class.java)
                moveWithDataIntent.putExtra(activityWithData.EXTRA_NAME, "Imam Fadhkur Rokhim")
                moveWithDataIntent.putExtra(activityWithData.EXTRA_AGE, 21)
                startActivity(moveWithDataIntent)
            }
            R.id.btn_dial_number->{
                val number = "083846902341"
                val intentDial = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$number"))
                startActivity(intentDial)
            }
            R.id.to_views_and_view_group->{
                val toGroup = Intent(this@MainActivity, viewsAndViewGroup::class.java)
                startActivity(toGroup)
            }
            R.id.to_recycler->{
                val toRecycler = Intent(this@MainActivity, recyclerView::class.java)
                startActivity(toRecycler)
            }
        }
    }
}
