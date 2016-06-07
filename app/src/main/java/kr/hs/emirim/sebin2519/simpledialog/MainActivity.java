package kr.hs.emirim.sebin2519.simpledialog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but=(Button)findViewById(R.id.but_dialog);
        but.setOnClickListener(this);//버튼이 클릭이 됫는지 안됫는지 감시
        //이벤트 핸들러 클래스(버튼을 눌렀을 때 동작, 처리하는 클래스)
    }

    //onClick메서드 구현
    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        AlertDialog.Builder dialog =new AlertDialog.Builder(this);//getApplicationContext(): 현재 엑티비티의 문맥을 반환
        dialog.setTitle("First Dialog");
        dialog.setMessage("This is a message part!");
        dialog.setIcon(R.drawable.first_icon);
        dialog.setPositiveButton("확인",null);
        dialog.show();
    }
}
