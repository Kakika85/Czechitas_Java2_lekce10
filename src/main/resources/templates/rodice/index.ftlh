[#ftl]

[@c.page title="Seznam rodičů"]
    <h1>Seznam rodičů</h1>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Jméno</th>
            <th scope="col">Příjmení</th>
            <th scope="col"></th>
        </tr>
        </thead>
        <tbody>
        [#list rodice as rodic]
            <tr>
                <td>${rodic.jmeno}</td>
                <td>${rodic.prijmeni}</td>
                <td><a href="/rodice/${rodic.id}"><i class="bi bi-arrow-right-square-fill"></i></a></td>
            </tr>
        [/#list]
        </tbody>
    </table>
[/@c.page]
