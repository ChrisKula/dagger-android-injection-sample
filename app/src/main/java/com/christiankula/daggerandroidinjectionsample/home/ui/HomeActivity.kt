package com.christiankula.daggerandroidinjectionsample.home.ui

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.christiankula.daggerandroidinjectionsample.R
import com.christiankula.daggerandroidinjectionsample.common.CommonHelloWorldService
import com.christiankula.daggerandroidinjectionsample.home.HomeHelloWorldService
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.content_home.*
import javax.inject.Inject


class HomeActivity : AppCompatActivity(), HasSupportFragmentInjector {

    @Inject
    lateinit var fragmentDispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    @Inject
    lateinit var commonHelloWorldService: CommonHelloWorldService

    @Inject
    lateinit var homeHelloWorldService: HomeHelloWorldService

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        sayCommonHelloWorld()
        sayHomeHelloWorld()
    }

    private fun sayCommonHelloWorld() {
        commonHelloWorld.text = commonHelloWorldService.getHelloWorld()
    }

    private fun sayHomeHelloWorld() {
        homeHelloWorld.text = homeHelloWorldService.getHelloWorld()
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return fragmentDispatchingAndroidInjector
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
