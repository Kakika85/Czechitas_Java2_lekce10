[#ftl]

[@c.page]
    <div class="px-4 py-5 my-5 text-center">
        <h1 class="display-5 fw-bold text-body-emphasis">Vítejte ve školní evidenci.</h1>
        <div class="col-lg-6 mx-auto">
            <p class="lead mb-4">Školní evidence umožňuje evidovat třídy, studenty, učitele a rodiče.</p>
        </div>
        <div class="row row-cols-1 row-cols-md-2 g-4">
            <div class="col">
                [@card title="Třídy" href="/tridy" image="/images/tridy.jpg"]Evidence tříd, jejich třídních učitelů a studentů.[/@card]
            </div>
            <div class="col">
                [@card title="Učitelé" href="/ucitele" image="/images/ucitele.jpg"]Evidence všech učitelů.[/@card]
            </div>
            <div class="col">
                [@card title="Studenti" href="/studenti" image="/images/studenti.jpg"]Evidence všech studentů.[/@card]
            </div>
            <div class="col">
                [@card title="Rodiče" href="/rodice" image="/images/rodice.jpg"]Evidence všech rodičů a jejich kontaktních údajů.[/@card]
            </div>
        </div>
    </div>

[/@c.page]

[#macro card title image href]
    <div class="card">
        <a href="${href}" class="text-decoration-none text-body">
            <img src="${image}" class="card-img-top" alt="">
            <div class="card-body">
                <h5 class="card-title">${title}</h5>
                <p class="card-text text-secondary">[#nested]</p>
            </div>
        </a>
    </div>
[/#macro]
