import java.util.Random;

public class WordBase {
    private static String[] ControlVerbs = {"chud", "goycel", "bugman", "wagie", "paypig", "normoid", "plebcel", "consumer", "npc", "serf", "vatgrown citizen", "midwit", "civvie", "drone"};
    private static String[] Adjectives = {"neurocompliant", "obedience-trained", "soy-infused", "compliance-grade", "serotonin-depleted", "hyperprocessed", "domesticated", "stimulation-dependent", "low-agency", "comfort-conditioned", "algorithm-fed", "sedation-stabilized", "consumption-optimized", "behavior-neutralized", "passivity-enhanced"};
    private static String[] Identity = {"nutrient slurry", "ration paste", "consumer feed", "dopamine ration", "stimulation stream", "algorithmic pipeline", "enrichment protocol", "compliance regimen", "sedation mixture", "content feed", "behavioral conditioning program", "neural enrichment slurry", "consumption grid", "broadcast pipeline", "metabolic ration block"};
    private static String[] InstrumentNoun = {"obedience-maxxing", "comfort-maxxing", "consumption-maxxing", "sedation-maxxing", "compliance-maxxing", "convenience-maxxing", "stimulation-maxxing", "dependency-maxxing", "entertainment-maxxing", "security-maxxing", "routine-maxxing", "conformity-maxxing", "normcel", "wagecel", "consumercel", "retailcel", "comfortcel", "civcel", "mediacel", "statuscel", "dopaminecel", "routinecel"};
    private static String[] StateVerb = {"conditioning", "compliance-training", "obedience-calibrating", "sedation-feeding", "behavior-optimizing", "stimulation-regulating", "dopamine-metering", "consumption-integrating", "routine-stabilizing", "dependency-conditioning", "cognition-dampening", "impulse-regulating", "pattern-reinforcing", "control-looping"};
    private static String[] Outcome = {"assimilates", "integrates", "converges", "upgrades", "aligns", "stabilizes", "transitions", "merges", "normalizes", "adapts", "locks into", "calibrates to", "synchronizes with", "stabilizes within", "embeds into"};

    public static String getControlVerb() {
        Random rand = new Random();
        return ControlVerbs[rand.nextInt(ControlVerbs.length)];
        }
        public static String getAdjective() {
        Random rand = new Random();
        return Adjectives[rand.nextInt(Adjectives.length)];
        }
        public static String getIdentity() {
        Random rand = new Random();
        return Identity[rand.nextInt(Identity.length)];
    }
        public static String getInstrumentNoun() {
        Random rand = new Random();
        return InstrumentNoun[rand.nextInt(InstrumentNoun.length)];
        }
        public static String getStateVerb() {
        Random rand = new Random();
        return StateVerb[rand.nextInt(StateVerb.length)];
        }
        public static String getOutcome() {
        Random rand = new Random();
        return Outcome[rand.nextInt(Outcome.length)];
        }
}
