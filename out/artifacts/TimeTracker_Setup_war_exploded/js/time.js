/**
 * view controller for time entries
 *
 * Time Tracker
 *
 * @author  Marcel Suter
 */

/**
 * register listeners
 */
$(document).ready(function () {
    showMessage("empty", " ");
    readCount();

});

function readCount() {
    $
        .ajax({
            url: "./resource/auth/count",
            dataType: "json",
            type: "GET"
        })
        .done(showCount)
        .fail(function (xhr) {
            if (xhr.status == 401) {
                window.location.href = './login.html';
            } else {
                showMessage("error", "Es ist ein Fehler aufgetreten");
            }
        })
}

function showCount(jsonData) {
    showMessage("info", "Anzahl Benutzer: " + jsonData);
}
