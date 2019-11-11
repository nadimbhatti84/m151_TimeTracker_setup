/**
 * common functions for all pages
 *
 * Time Tracker
 *
 * @author  Marcel Suter
 */

/**
 * register listeners
 */
$(function () {

});

/**
 * gets the base URL for api-calls
 * @returns {string}
 */
function apiURL() {
    return "./";
}

/**
 * shows a bootstrap alert-message
 * @param type
 * @param message
 */
function showMessage(type, message) {
    var classes = "";
    if (type !== "empty")
        classes = "alert alert-" + type;

    $("#message")
        .removeClass()
        .addClass(classes)
        .text(message);
}