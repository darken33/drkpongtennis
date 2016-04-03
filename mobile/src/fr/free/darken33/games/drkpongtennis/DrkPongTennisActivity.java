package fr.free.darken33.games.drkpongtennis;

import com.phonegap.*;
import android.os.Bundle;
/**
 * DrkPongTennisActivity - Activite principale pour drkPongTennis
 * 
 * @author Philippe Bousquet <darken33@free.fr>
 * @date 10/07/2012
 * @version 1.0
 * @license Gnu General Public License v3
 *
 */
public class DrkPongTennisActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}
