[#ftl]

[#macro page title="Školní evidence"]
    <!doctype html>
    <html lang="cs">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>${title}</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
        <link rel="icon" href="/images/favicon.png" type="image/png">
    <body>
    [@navbar /]
    <div class="container">
        [#nested]
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </head>
    </body>
    </html>
[/#macro]

[#macro navbar]
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
        <div class="container-fluid">
            <a class="navbar-brand" href="/">Školní evidence</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    [@navbarLink text="Třídy" href="/tridy" /]
                    [@navbarLink text="Studenti" href="/studenti" /]
                    [@navbarLink text="Učitelé" href="/ucitele" /]
                    [@navbarLink text="Rodiče" href="/rodice" /]
                </ul>
            </div>
        </div>
    </nav>
[/#macro]

[#macro navbarLink text href]
    <li class="nav-item">
        <a class="nav-link ${(springMacroRequestContext.requestUri == href)?string("active", "") }" aria-current="page" href="${href}">${text}</a>
    </li>
[/#macro]
