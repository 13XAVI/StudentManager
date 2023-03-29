
const translations = {
    en: {
        name: "Login Page",
        title: "Login",
        email: "Email",
        password: "Password",
        login: "Login",
        sign_up: "No account,please ",
        link: "Sign Up"

    },
    fr: {
        name: "Page de connexion",
        title: "Connexion",
        email: "Email",
        password: "Mot de passe",
        login: "Connexion",
        sign_up: "Pas de compte, veuillez vous ",
        link: "Inscrire"

    },
    kin: {
        name: "Urupapuro rw\'injira",
        title: "Injira",
        email: "Imeri",
        password: "Ijambo ry\'ibanga",
        login: "Injira",
        sign_up: "Nta konte, nyamuneka ",
        link: "Iyandikishe"
    }
};
// function to update all elements with translations
function updateTranslations(lang) {
    // get all elements with a data-i18n attribute
    const elements = document.querySelectorAll("[data-i18n]");
    // loop through all elements and update their text
    for (let element of elements) {
        const key = element.getAttribute("data-i18n");
        element.textContent = translations[lang][key];
    }
    // update navigation links
    const navLinks = document.querySelectorAll("[data-i18n-nav]");
    for (let link of navLinks) {
        const key = link.getAttribute("data-i18n-nav");
        link.textContent = translations[lang].nav[key];
    }
}

// function to get the current language from the select element
function getCurrentLanguage() {
    const select = document.getElementById("language-select");
    return select.value;
}

// function to set the current language to a new value
function setCurrentLanguage(lang) {
    const select = document.getElementById("language-select");
    select.value = lang;
}

// add event listener to update translations when select value changes
const select = document.getElementById("language-select");
select.addEventListener("change", () => {
    const lang = getCurrentLanguage();
    updateTranslations(lang);
});

// set initial language based on the select element value
const lang = getCurrentLanguage();
updateTranslations(lang);
