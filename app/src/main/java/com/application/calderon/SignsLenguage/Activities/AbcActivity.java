package com.application.calderon.SignsLenguage.Activities;

        import android.content.Intent;
        import android.content.SharedPreferences;
        import android.os.Parcelable;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.GridLayoutManager;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;
        import android.support.v7.widget.Toolbar;
        import android.view.ContextMenu;
        import android.view.Menu;
        import android.view.MenuInflater;
        import android.view.MenuItem;
        import android.view.View;

        import com.application.calderon.SignsLanguage.Adapters.AdapterAbc;
        import com.application.calderon.SignsLanguage.Images.LetterA;
        import com.application.calderon.SignsLanguage.Images.LetterB;
        import com.application.calderon.SignsLanguage.Images.LetterC;
        import com.application.calderon.SignsLanguage.Images.LetterD;
        import com.application.calderon.SignsLanguage.Images.LetterE;
        import com.application.calderon.SignsLanguage.Images.LetterEne;
        import com.application.calderon.SignsLanguage.Images.LetterF;
        import com.application.calderon.SignsLanguage.Images.LetterG;
        import com.application.calderon.SignsLanguage.Images.LetterH;
        import com.application.calderon.SignsLanguage.Images.LetterI;
        import com.application.calderon.SignsLanguage.Images.LetterJ;
        import com.application.calderon.SignsLanguage.Images.LetterK;
        import com.application.calderon.SignsLanguage.Images.LetterL;
        import com.application.calderon.SignsLanguage.Images.LetterM;
        import com.application.calderon.SignsLanguage.Images.LetterN;
        import com.application.calderon.SignsLanguage.Images.LetterO;
        import com.application.calderon.SignsLanguage.Images.LetterP;
        import com.application.calderon.SignsLanguage.Images.LetterQ;
        import com.application.calderon.SignsLanguage.Images.LetterR;
        import com.application.calderon.SignsLanguage.Images.LetterS;
        import com.application.calderon.SignsLanguage.Images.LetterT;
        import com.application.calderon.SignsLanguage.Images.LetterU;
        import com.application.calderon.SignsLanguage.Images.LetterV;
        import com.application.calderon.SignsLanguage.Images.LetterW;
        import com.application.calderon.SignsLanguage.Images.LetterX;
        import com.application.calderon.SignsLanguage.Images.LetterY;
        import com.application.calderon.SignsLanguage.Images.LetterZ;
        import com.application.calderon.SignsLanguage.Models.Letter;
        import com.application.calderon.SignsLanguage.R;
        import com.application.calderon.SignsLanguage.Utils.Util;
        import com.application.calderon.SignsLenguage.Models.Letter;

        import java.util.List;

public class AbcActivity extends AppCompatActivity implements View.OnCreateContextMenuListener{

    private SharedPreferences prefs;

    private List<Letter> letters;

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abc);

        prefs = getSharedPreferences("Preferences", MODE_PRIVATE);

        setToolbar();
        letters = Util.getAllLetters();


        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerViewAbc);
        mLayoutManager = new GridLayoutManager(this,3);

        mAdapter = new AdapterAbc(letters, R.layout.card_view_abc, this, new AdapterAbc.OnItemClickListener() {
            @Override
            public void onItemClick(Letter letter, int position) {
                String letterSelect = letter.getTextLetter();
                Intent intent;
                switch (letterSelect) {
                    case "A":
                        intent = new Intent(AbcActivity.this, LetterA.class);
                        intent.putExtra("letter", letterSelect);
                        startActivity(intent);
                        break;
                    case "B":
                        intent = new Intent(AbcActivity.this, LetterB.class);
                        intent.putExtra("letter", letterSelect);
                        startActivity(intent);
                        break;
                    case "C":
                        intent = new Intent(AbcActivity.this, LetterC.class);
                        intent.putExtra("letter", letterSelect);
                        startActivity(intent);
                        break;
                    case "D":
                        intent = new Intent(AbcActivity.this, LetterD.class);
                        intent.putExtra("letter", letterSelect);
                        startActivity(intent);
                        break;
                    case "E":
                        intent = new Intent(AbcActivity.this, LetterE.class);
                        intent.putExtra("letter", letterSelect);
                        startActivity(intent);
                        break;
                    case "F":
                        intent = new Intent(AbcActivity.this, LetterF.class);
                        intent.putExtra("letter", letterSelect);
                        startActivity(intent);
                        break;
                    case "G":
                        intent = new Intent(AbcActivity.this, LetterG.class);
                        intent.putExtra("letter", letterSelect);
                        startActivity(intent);
                        break;
                    case "H":
                        intent = new Intent(AbcActivity.this, LetterH.class);
                        intent.putExtra("letter", letterSelect);
                        startActivity(intent);
                        break;
                    case "I":
                        intent = new Intent(AbcActivity.this, LetterI.class);
                        intent.putExtra("letter", letterSelect);
                        startActivity(intent);
                        break;
                    case "J":
                        intent = new Intent(AbcActivity.this, LetterJ.class);
                        intent.putExtra("letter", letterSelect);
                        startActivity(intent);
                        break;
                    case "K":
                        intent = new Intent(AbcActivity.this, LetterK.class);
                        intent.putExtra("letter", letterSelect);
                        startActivity(intent);
                        break;
                    case "L":
                        intent = new Intent(AbcActivity.this, LetterL.class);
                        intent.putExtra("letter", letterSelect);
                        startActivity(intent);
                        break;
                    case "M":
                        intent = new Intent(AbcActivity.this, LetterM.class);
                        intent.putExtra("letter", letterSelect);
                        startActivity(intent);
                        break;
                    case "N":

                        intent = new Intent(AbcActivity.this, LetterN.class);
                        intent.putExtra("letter", letterSelect);
                        startActivity(intent);
                        break;
                    case "Ñ":
                        intent = new Intent(AbcActivity.this, LetterEne.class);
                        intent.putExtra("letter", letterSelect);
                        startActivity(intent);
                        break;
                    case "O":
                        intent = new Intent(AbcActivity.this, LetterO.class);
                        intent.putExtra("letter", letterSelect);
                        startActivity(intent);
                        break;
                    case "P":
                        intent = new Intent(AbcActivity.this, LetterP.class);
                        intent.putExtra("letter", letterSelect);
                        startActivity(intent);
                        break;
                    case "Q":
                        intent = new Intent(AbcActivity.this, LetterQ.class);
                        intent.putExtra("letter", letterSelect);
                        startActivity(intent);
                        break;
                    case "R":
                        intent = new Intent(AbcActivity.this, LetterR.class);
                        intent.putExtra("letter", letterSelect);
                        startActivity(intent);
                        break;
                    case "S":
                        intent = new Intent(AbcActivity.this, LetterS.class);
                        intent.putExtra("letter", letterSelect);
                        startActivity(intent);
                        break;
                    case "T":
                        intent = new Intent(AbcActivity.this, LetterT.class);
                        intent.putExtra("letter", letterSelect);
                        startActivity(intent);
                        break;
                    case "U":
                        intent = new Intent(AbcActivity.this, LetterU.class);
                        intent.putExtra("letter", letterSelect);
                        startActivity(intent);
                        break;
                    case "V":
                        intent = new Intent(AbcActivity.this, LetterV.class);
                        intent.putExtra("letter", letterSelect);
                        startActivity(intent);
                        break;
                    case "W":
                        intent = new Intent(AbcActivity.this, LetterW.class);
                        intent.putExtra("letter", letterSelect);
                        startActivity(intent);
                        break;
                    case "X":
                        intent = new Intent(AbcActivity.this, LetterX.class);
                        intent.putExtra("letter", letterSelect);
                        startActivity(intent);
                        break;
                    case "Y":
                        intent = new Intent(AbcActivity.this, LetterY.class);
                        intent.putExtra("letter", letterSelect);
                        startActivity(intent);
                        break;
                    case "Z":
                        intent = new Intent(AbcActivity.this, LetterZ.class);
                        intent.putExtra("letter", letterSelect);
                        startActivity(intent);
                        break;
                }

            }

        }, new View.OnCreateContextMenuListener() {
            @Override
            public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

                AdapterAbc.ViewHolder info = (AdapterAbc.ViewHolder) menuInfo;
                //recogemos la posicion con el metodo getApadterPosition
                Letter letterSelect = letters.get(info.getAdapterPosition());

                //establecemos titulo e icono para cada elemento mirando en sus propiedades
                menu.setHeaderTitle(letterSelect.getTextLetter());

                //-inflamos el option_menu
                MenuInflater inflater = getMenuInflater();
                inflater.inflate(R.menu.menu_context, menu);
                for (int i = 0; i < menu.size(); i++) {
                    menu.getItem(i).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem item) {
                            //Obtener info en el context menu del objeto que se pinche

                            AdapterAbc.ViewHolder info = (AdapterAbc.ViewHolder) item.getMenuInfo();
                            switch (item.getItemId()) {
                                case R.id.completedLetter:
                                    Util.letterCompleted = true;
                                    Util.positionLetter = (String) info.letter.getText();
                                default:
                                    return false;
                            }
                        }
                    });
                }
            }

        });
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }


    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.alphabet);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_home);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_options, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                Util.nextScreen(AbcActivity.this, MainActivity.class);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}