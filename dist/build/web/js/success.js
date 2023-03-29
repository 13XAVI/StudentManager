const translations = {
  en: {
    message: "Your registration form has be submitted successfully, you will receive a confirmation email shortly. To return home page",
    success: "click here"

  },
  fr: {
    message: "Votre formulaire d'inscription a été soumis avec succès, vous recevrez un e-mail de confirmation sous peu. Pour revenir à la page d'accueil",
    success: "Cliquez ici"


  },
  kin: {
    message: "Ifishi yawe yo kwiyandikisha yatanzwe neza, urabona imeri mumpanya muto. Gusubira ahabanza",
    success: "Kanda hano"

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



function changeLanguage() {
    var selectElement = document.getElementById("language-select");
    var selectedValue = selectElement.options[selectElement.selectedIndex].value;
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

