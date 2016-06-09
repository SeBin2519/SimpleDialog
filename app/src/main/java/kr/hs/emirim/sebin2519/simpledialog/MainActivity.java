package kr.hs.emirim.sebin2519.simpledialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button but;
    String[] items={"젤리빈", "킷켓", "롤리팝","마시멜로우"};
    boolean[] checkArr={false,true,false,false};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but=(Button)findViewById(R.id.but_dialog);
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
        AlertDialog.Builder dialog =new AlertDialog.Builder(this);//getApplicationContext(): 현재 엑티비티의 문맥을 반환 , 현재클래스를 반환
        dialog.setTitle("First Dialog");
        //dialog.setMessage("This is a message part!");

        /* dialog.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) { //which : 항목의 인덱스번호
                but.setText(items[which]);
            }
        });//항목을 선택하면 익명클래스 실행 */

       /* dialog.setSingleChoiceItems(items, 0, new DialogInterface.OnClickListener(){ //0으로 하면 실행시 1번째가 선택됨
            @Override
            public void onClick(DialogInterface dialog, int which) {
                but.setText(items[which]);
            }
        });*/


        dialog.setIcon(R.drawable.first_icon);
       dialog.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "대화상자의 확인 버튼을 클릭하셨습니다~!!", Toast.LENGTH_LONG).show(); //this -> 익명클래스 객체 this
            }
        }); //핸들러 자리, 익명클래스: 인터페이스로 상속받아 객체생성까지!
        dialog.show();
    }
}
