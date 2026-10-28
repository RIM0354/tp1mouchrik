package ma.emsi.mouchrik.tp1.llm;

/**
 * Résultat d'un échange avec l'API du LLM.
 *
 * @param questionJson    texte JSON de la requête envoyée à l'API (mis en forme).
 * @param reponseJson     texte JSON de la réponse renvoyée par l'API.
 * @param reponseExtraite la réponse à afficher à l'utilisateur, extraite du JSON de la réponse.
 */
public record LlmInteraction(String questionJson, String reponseJson, String reponseExtraite) {
}
