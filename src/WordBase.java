import java.util.Random;

public class WordBase {
    private static String[] ControlVerbs = {"chud", "goycel", "bugman", "wagie", "paypig", "normoid", "plebcel", "consumer", "npc", "serf", "vatgrown citizen", "midwit", "civvie", "drone"};
    private static String[] Adjectives = {"neurocompliant", "obedience-trained", "soy-infused", "compliance-grade", "serotonin-depleted", "hyperprocessed", "domesticated", "stimulation-dependent", "low-agency", "comfort-conditioned", "algorithm-fed", "sedation-stabilized", "consumption-optimized", "behavior-neutralized", "passivity-enhanced" , "chud", "terracchud", "brontochud", "foid", "chadlite", "Adamlite", "Stacy", "Becky", "Chad", "truecel", "makeupcel", "consumercel", "chud army", "lookmaxers"};
    private static String[] Identity = {
            // existing dystopian feed terms
            "nutrient slurry",
            "ration paste",
            "consumer feed",
            "dopamine ration",
            "stimulation stream",
            "algorithmic pipeline",
            "enrichment protocol",
            "compliance regimen",
            "sedation mixture",
            "content feed",
            "behavioral conditioning program",
            "neural enrichment slurry",
            "consumption grid",
            "broadcast pipeline",
            "metabolic ration block",

            // meme / identity descriptors
            "sub5",
            "6’2",
            "4’3",
            "negative canthal tilt",
            "fakecel",
            "fraud",
            "newborn",
            "star quarterback",
            "millionaire",
            "secret agent",

            // added brainrot-compatible identities
            "gigachud",
            "sigma entity",
            "omega consumer",
            "npc unit",
            "hyperconsumer",
            "dopamine warrior",
            "algorithm subject",
            "test batch specimen",
            "certified gooner",
            "factory-grown citizen",
            "tier-3 consumer",
            "simulation resident",
            "prime subject",
            "level-100 npc",
            "government prototype",
            "elite operative",
            "baseline human",
            "experimental clone",
            "main character",
            "side character"
    };

    private static String[] InstrumentNoun = {"obedience-maxxing", "comfort-maxxing", "consumption-maxxing", "sedation-maxxing", "compliance-maxxing", "convenience-maxxing", "stimulation-maxxing", "dependency-maxxing", "entertainment-maxxing", "security-maxxing", "routine-maxxing", "conformity-maxxing", "normcel", "wagecel", "consumercel", "retailcel", "comfortcel", "civcel", "mediacel", "statuscel", "dopaminecel", "routinecel" , "Chudtopia", "mountains of God Gandy", "jerkmate World Cup", "spy baby monitor", "4chan", "family"};
    private static String[] StateVerb = {

            // original system/process tone
            "conditioning",
            "compliance-training",
            "obedience-calibrating",
            "sedation-feeding",
            "behavior-optimizing",
            "stimulation-regulating",
            "dopamine-metering",
            "consumption-integrating",
            "routine-stabilizing",
            "dependency-conditioning",
            "cognition-dampening",
            "impulse-regulating",
            "pattern-reinforcing",
            "control-looping",

            // added brainrot process verbs
            "sigma-conditioning",
            "npc-conditioning",
            "algorithm-training",
            "dopamine-farming",
            "slop-consuming",
            "reality-warping",
            "timeline-corrupting",
            "identity-rewriting",
            "brainrot-amplifying",
            "feed-optimizing",
            "simulation-calibrating",
            "consumer-maxxing",
            "attention-harvesting",
            "signal-boosting",
            "hyper-conditioning",
            "behavior-overclocking",
            "mind-syncing",
            "neural-overwriting",
            "habit-installing",
            "loop-locking",

            // outcome-style transitional verbs (brainrot compatible)
            "exposes",
            "bans",
            "proves",
            "reminds",
            "collapses",
            "awakens",
            "spawns",
            "summons",
            "joins",
            "results in",
            "triggers",
            "initiates",
            "activates",
            "deploys",
            "launches"
    };

    private static String[] Outcome = {
            "maxxes",
            "hard-maxxes",
            "ultra-maxxes",
            "ascends",
            "transcends",
            "evolves into",
            "mutates into",
            "glitches into",
            "absorbs",
            "devours",
            "consumes",
            "overclocks",
            "hypercharges",
            "speedruns",
            "solo-carries",
            "outscales",
            "breaks reality into",
            "summons",
            "awakens",
            "activates",
            "spawns",
            "levels up into",
            "combos into",
            "chains into",
            "transforms into",
            "upgrades into",
            "merges with",
            "binds to",
            "corrupts into",
            "converts into"
    };


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

        public String GetString() {
        Random rand = new Random();
        int choice = rand.nextInt(3);
        switch (choice) {
            case 0: return Template1();
            case 1: return Template2();
            case 2: return Template3();

        }
        return "";
    }
        public String Template1() {
        return "Me " + getControlVerb() + " my " + getAdjective() + " " + getIdentity() + " via " + getInstrumentNoun() + " so that he " + getOutcome();
        }
    public String Template2() {
        return "Bro really " + getControlVerb() + " that " + getAdjective() + " "
                + getIdentity() + " using the " + getInstrumentNoun()
                + " and now he " + getOutcome();
    }
    public String Template3() {
        return "Why did my " + getAdjective() + " " + getIdentity()
                + " suddenly " + getControlVerb() + " through a "
                + getInstrumentNoun() + " just to " + getOutcome() + "?";
    }
}
