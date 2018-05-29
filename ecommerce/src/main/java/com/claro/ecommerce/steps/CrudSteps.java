package com.claro.ecommerce.steps;

import com.claro.ecommerce.pages.CrudPage;
import org.jbehave.core.annotations.*;

public class CrudSteps extends CrudPage {

    @Given("I open the web page")
    public void stepIOpenTheWebPage(){
        abrirPagina();
    }
}
